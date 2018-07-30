package a_datatype;

import java.util.Scanner;

public class HomeWork {
	public static void main(String args[]) {
	   Scanner scanner = new Scanner (System.in);
	   
	   int kor;
	   int eng;
	   int mat;
	   kor = scanner.nextInt();
	   eng = scanner.nextInt();
	   mat = scanner. nextInt();
	   scanner.close();
	   int result = kor + eng + mat;
	   System.out.println(result );
	   double average = (double)(kor + eng + mat)/3;
	  
	   System.out.println(average);
	}
}