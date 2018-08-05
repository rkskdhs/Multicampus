package practice_0801;
import java.util.Scanner;
public class Ex15_practice {

	public static void main(String[] args) {


		int [] as =input();
		int sum = getTotal(as);
		int avg =  getavg(sum);
		int result = output();
		System.out.println(result);

		static int [] input() {
			Scanner in = new Scanner(System.in);
			int [] as = new int [3];

			int kor = in.nextInt();
			int eng = in.nextInt();
			int mat = in.nextInt();

			as[0] = kor;
			as[1] = eng;
			as[2] = mat;
			in.close();
			return as;
		}
		static int  getTotal(int [] as) {
			for(int i = 0; i>as.length; i++) {
				sum+=as[i];
			}
			return sum;
		}
	}

}
