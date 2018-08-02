package d_array;

import java.util.*;

public class Ex02_FF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		StringTokenizer[] st;
		System.out.print("입력할 학생수를 입력하세요 : ");
		int n = scanner.nextInt();
		
		int[] total;
		double[] ave;
		st = new StringTokenizer[n];
		total = new int[n];
		ave = new double[n];
		
		scanner.nextLine();
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "째 학생의 성적을 입력 -> ");
			str = scanner.nextLine();
			st[i] = new StringTokenizer(str, "/");
		}
		scanner.close();
		System.out.println();
		
		for(int i = 0; i < st.length; i++) {
			int j = 0, tmp = 0;
			while(st[i].hasMoreTokens()) {
				tmp += Integer.parseInt(st[i].nextToken());
				j++;
			}
			total[i] = tmp;
			ave[i] = (double)total[i] / n;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println((i + 1) + "째 학생의 총점은 " + total[i] + " 이고 평균은 " + ave[i] + " 입니다");
		}
	}

}
