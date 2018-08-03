package e_Method;
import java. util.Scanner;
public class Ex02_성적 {

	public static void main(String[] args) {


		int [] as =input();
		int sum = getTotal(as);
		int avg =  getavg(sum);
		//		getScore();
		int result = output(avg);
		System.out.println(result);
	}
	static int[] input() {
		Scanner scanner = new Scanner(System.in);
		int[] as = new int[3];

		int k = scanner.nextInt();
		int e = scanner.nextInt();
		int m = scanner.nextInt();

		as[0] = k;
		as[1] = e;
		as[2] = m;
		scanner.close();
		return as;	
	}
	static int getTotal(int [] as) {
		int sum =as[0]+as[1]+as[2];
		return sum;
	}
	static int getavg(int sum) {
		int avg = sum/3;
		return avg;
	}
	static int output(int avg) {
		int result = avg;
		return result;
	}

}
