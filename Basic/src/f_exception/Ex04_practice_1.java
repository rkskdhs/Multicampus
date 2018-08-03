package f_exception;
import java.util.Scanner;

public class Ex04_practice_1 {
	public static void main(String[] args) {
		int result =checkUpper();
		System.out.println((char)result);
	}
	static int  checkUpper() {

		Scanner in = new Scanner(System.in);

		int a = in.nextLine().charAt(0);
		int result = 0;

		if(a>='A' && a<='Z') {
			result = a+32;

			if (a<'a'&& a>'z') {
				result = a-32;
			}
		}

		in.close();
		return result;
	}
}
