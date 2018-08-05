package practice_0801;
import java.util.Scanner;
public class Ex10_practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat = in.nextInt();
		
		double ave = (double)(kor + eng + mat)/3;
		
		int idx = (int)ave/10;
		char score = 0;
		
		switch(idx) {
		
		case 10: score = 'A'; break;
		case 9: score = 'B'; break;
		case 8: score = 'C'; break;
		case 7: score = 'D'; break;
		case 6: score = 'E'; break;
		
		}
		in.close();
		
		System.out.println(score);
		
	

	}

}
