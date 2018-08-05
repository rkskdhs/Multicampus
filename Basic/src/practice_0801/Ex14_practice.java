package practice_0801;
import java.util.Scanner;
public class Ex14_practice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		
		in.close();
		
		int [] arr = new int [] {a, b, c, d, e};
		
		int sum = 0;
		double ave = 0;
		
		for(int i= 0 ; i <arr.length; i++) {
			
			sum += arr[i];
			ave = sum/(double)arr.length;
			
		}
		System.out.println("총점은 "+ sum +"이고 ");
		System.out.println("평균은 "+ ave + "이다");
	}

}
