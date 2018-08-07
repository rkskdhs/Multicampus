package f_staic.practice;

import java.util.Scanner;

public class bookMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String number = in.nextLine();
		System.out.println("책번호 : " + number);
		String title  = in.nextLine();
		System.out.println("책 제목 :" + title);
		String author = in.nextLine();
		System.out.println("저자 :" + author);
		
		book b = new book(number, title, author);
		
		
		
		
		
		System.out.println("책 객수 :" + book.getCount());
		in.close(); 
		
		
		//String [] arr = new arr [1000];
		
	}
}
