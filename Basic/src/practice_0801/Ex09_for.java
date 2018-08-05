package practice_0801;
import java.util.Calendar;
import java.util.Scanner;


public class Ex09_for {
	public static void main(String[] args) {
			
		Scanner id = new Scanner(System.in);
		String min = id.next();
		
		char sung = min.charAt(7);
		
		if(sung == 1 || sung == 3) {
			System.out.println("남자이고 ");
		}else if(sung == 2 || sung == 4) {
			System.out.println("여자이고 ");
		}
		String birth = min.substring(0,2);
		int yeon = Integer.parseInt(birth);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		
		
		if (sung ==1 || sung == 3) {
			int nai = year - (1900+yeon)+1;
		}else if(sung == 2 || sung == 4) {
		    int nai = year-(2000+yeon)+1;
		}
		System.out.println("나이는 "+nai);
		
		id.close();
	}
}