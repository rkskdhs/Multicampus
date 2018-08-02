package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex02_성적 {

	public static void main(String[] args) {
//		//4명의 국영수 점수 관리.
//		int [][] score= new int [4][3];//먼저 배열을 의미하는 선언하고 뒤에 갯수 반영.
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");
		
		int [][] score = new int[4][3];
//		String[] subname = new String[3];
//		subname[0] = "국어";
//		subname[0] = "수학";
//		subname[0] = "영어";
//		or 초기화
		String[] subname = {"국어", "수학", "영어"};
		
		for(int i =0; i<subname.length; i++) {
			System.out.println(subname[i]+"과목 총점");
		}
		
		
		
		

	}

}
