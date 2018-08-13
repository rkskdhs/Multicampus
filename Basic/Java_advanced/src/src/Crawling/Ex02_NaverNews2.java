package crowling;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Ex02_NaverNews2 {
	
	// 크롬에서 네이버에서 뉴스를 선택하고 검색창에 '빅데이터'라는 단어를 입력 후 페이지 번호를 눌려
	// 다시 url 을 확인하여 페이지번호 들어가는 곳을 확인한다.
	static String BASE_URL = "https://search.naver.com/search.naver?&where=news&query=%EB%B9%85%EB%8D%B0%EC%9D%B4%ED%83%80"
			+ "&sm=tab_pge&sort=0&photo=0&field=0&reporter_article=&pd=0&ds=&de=&docid=&nso=so:r,p:all,a:all&mynews=0&cluster_rank=18"
			//+ "&start=71&refresh_start=0";
			+"$start=";
	// 페이지 번호를 누를 때마다 start 파라메더의 시작번호만 바뀐다.
	static String URL_END = "&refresh_start=0";
	static int START_PAGE = 1;					// 페이지 변경하기 위한  변수

	static String COMPLETE_URL = BASE_URL + "&start="+START_PAGE +URL_END;

	public static void main(String[] args) {
		try {
			int page = 1;
			while( page <= 100) {
				Connection conn = Jsoup.connect(COMPLETE_URL);
				//conn.header("Accept", "text/html, application/xhtml+xml, */*");
				conn.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko");
				//conn.header("Accept-Encoding", "gzip, deflate");
				conn.header("Accept-Language", "ko-KR");
				conn.header("Connection", "Keep-Alive");
				Document naver_news = conn.get();
				//System.out.println(naver_news);

				//--------------------------------------------------------
				// 개발자모드 F12에서 화살표를 누르고 각각 제목에 대면 a 태그에 _sp_each_url 클래스값을 발견
				Elements news_url = naver_news.select("a._sp_each_url");

				for( Element el : news_url) {
					//System.out.println(el);
					String url = el.attr("href");

					if( url.contains("news.naver.com")) {		// 네이버뉴스만 거른다
						Document doc = Jsoup.connect(url).get();

						// 해당 각각의 뉴스에서 제목과 본문만 얻어온다.
						Elements body = doc.select("div#articleBodyContents");	
						String str = body.text();
						System.out.println("[ 본문 내용 ] "+str);
						Elements title = doc.select("h3#articleTitle");	
						String titleStr =  title.text();
						System.out.println("[ 기사 제목 ] "+ titleStr);
					}
				}
				System.out.println("---------------------------------------- 페이지 : " + page);
				page += 10;
				START_PAGE = page;
				COMPLETE_URL = BASE_URL + "&start="+START_PAGE +URL_END;
			}
		}catch( Exception ex) {
			System.out.println("예외발생: " + ex.getMessage());
		}
	}

}
