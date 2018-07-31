package c_Control;

import java.util.Scanner;

public class Ex04_Homework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			
		 System.out.println("윤년이다.");
		}else {
			
		System.out.println("윤년이 아니다");
		}
		scanner.close();

	}

}
