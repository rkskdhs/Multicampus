package Crawling;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class sample {

	public static void main(String[] args) {

		try {
			String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=018&aid=0004171212";
			Document doc = Jsoup.connect(url).get();
			//System.out.println(doc);
			Elements body = doc.select("div#articleBodyContents");
			System.out.println(body);
			
			System.out.println("<본문>"+ body.text());
			
		}catch(Exception ex) {
			System.out.println("예외발생"+ ex.getMessage());
			ex.printStackTrace();
		}
	}

}
