package d_array;
import java.util.Calendar;
public class Ex03_Month {

	public static void main(String[] args) { //캘린더는 new가 아니다 메모리를 새로 지정해주는 게 아니기 떄문이다
		Calendar c = Calendar.getInstance();//instance는 객체 object 이미 있는 것을 얻어 옴
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH)+1; //서양은 문자개념입니다
		int d = c.get(Calendar.DATE);
		int w = c.get(Calendar.DAY_OF_WEEK);//처음 시작인 일요일은 값이1이지만 배열에서는 0번쨰이다 그래서 1뺴주기
		String []  wStr = {"일", "월", "화","수","목","금","토"};
		System.out.println(y+"년 "+m+"월 "+d+"일 "+wStr[w-1]+"요일");

	}

}
