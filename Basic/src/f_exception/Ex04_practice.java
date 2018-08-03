package f_exception;
import java.util.Scanner;
public class Ex04_practice {

	public static void main(String[] args) {

		boolean result =checkLower();

		System.out.println(result); // false : 대문자, true: 소문자
	}
	static boolean checkLower() {

		Scanner in = new Scanner(System.in);
		char a = in.nextLine().charAt(0);
		boolean result = false;
		if(a>='A' && a<='Z') {
			result = false;
		}
		if(a>='a' && a<='z') {
			result = true;
			
			
		}
		in.close();
		return result;
	}
}
