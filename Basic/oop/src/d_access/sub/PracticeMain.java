package d_access.sub;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		System.out.println("학생수입력 ->"); //입력을 받아야 하는 것만 클래스로 묶어
		int n = in.nextInt();  // 학생수
		
		Practice [] g = new Practice[n];
		
		for (int i = 0; i < g.length; i++) {
			System.out.println("이름과 과목점수를 입력->");
			int id = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();

			int score []  = new int[3];
			score[0] = a;
			score[1] = b;
			score[2] = c;
			
			g[i] = new Practice(id, score);

			
			g[i].calTotal();
			g[i].calAverage();
		}
		

		// 
		for(int i=0; i<g.length-1; i++) {
			for(int j=0; j<g.length-i-1; j++) {
				if( g[j].getSum() > g[j+1].getSum()) {
					Practice temp = g[j];
					g[j] = g[j+1];
					g[j+1] = temp;
				}
			}
		}

		for(int j = 0 ; j < n ; j++) {
			System.out.println(j+"번쨰 학생의 점수는 "+ g[j].getSum() + "/" + g[j].getAvg() );
		}

		in.close();
	}
}


