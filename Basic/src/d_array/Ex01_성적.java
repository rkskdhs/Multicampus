package d_array;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex01_성적 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/");

		int [] kor = new int[5];
		int total = 0;//임의의 값을 넣어준다 
		double avg = 0.0;
		for(int i = 0; i<kor.length ; i++) {// kor.length-5쓸수 있어요
			kor[i] = Integer.parseInt(st.nextToken()); //문자열을 받을 수 없으니 이렇게 
		}
		for(int i = 0; i<kor.length ; i++) {//kor.length-5쓸수 있어요
			total += kor[i];
		}
		avg = total/5.0;
		System.out.println("총점"+total);
		System.out.println("평균"+avg);
		
		
		int max = kor [0];
		for (int i = 0 ; i<5 ; i++) {
			if(max<kor[i]) {
				max = kor[i];
				break;  //?????왜
			}
			
			
			System.out.println(max);
		}
			
	}

}
