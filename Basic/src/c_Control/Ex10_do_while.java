package c_Control;
import java.util.Scanner;
public class Ex10_do_while {

	public static void main(String[] args) {
		//		int sum = 0;
		//		int i = 1;
		//		do {                                    //do는 어찌되었든 한번은 알고리즘을 돈다.
		//			                                     // 왜 활용하니
		//			sum +=i;
		//			i++;
		//		}while( i <= 10);
		//		System.out.println("sum="+sum);
		Scanner in = new Scanner(System.in);
		int gugu =0;
		int j = in.nextInt();
		for(int i =  ; i>=1 && i<=9 ; i++);{
			gugu = i*j;s
		}
		System.out.println(gugu);
		char result = '/0';
		do {
			System.out.println("다시?");
			char result = in.nextLine().charAt(0);
		}while (result == 'Y'||'y');

	}
