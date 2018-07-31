package b_operator;
import java.util.Scanner;

public class Ex08_TripleVoid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		a = (a>b)? a:b;
		a = (a>c)? a:c;
		System.out.println(a);
		in.close();
	}
	}


