package c_Control;

import java.util.Scanner;

public class Ex03_Switch_주민번호 {

	public static void main(String[] args) {
		
//		String id = "950701-1115849";
//		char place = id.charAt(8);
//		String home = "";
//		switch(place) {
//		case '0' : home = "서울"; break;
//		case '1' : home = "경기도"; break;
//		case '2' : home = "인천/부산"; break;
//		case '3' : home = "제주도"; break;
//		default: home="한국인"; break;
//		}
//		System.out.println("Birth Place:"+ home);
		
		Scanner scanner = new Scanner (System.in);
		   
		   int kor;
		   int eng;
		   int mat;
		   kor = scanner.nextInt();
		   eng = scanner.nextInt();
		   mat = scanner. nextInt();
		   scanner.close();
		 
		   double average = (double)(kor + eng + mat)/3;
		   char score = '0';
		   switch( (int)(average/10) ) {
		   case 10: 
		   case 9 : score = 'A'; break;
		   case 8 : score = 'B'; break;
		   case 7 : score = 'C'; break;
		   case 6 : score = 'D'; break;
		   case 5 : score = 'E'; break;
		   default : score = 'F'; break;
		   
		   }
		   System.out.println("학점:"+score);

	}

}
//debugging mode 실행해보기