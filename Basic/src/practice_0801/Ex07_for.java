package practice_0801;
import java.util.Scanner;
public class Ex07_for {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int i = in.nextInt();
		
		for(int j = 1; j < i+1 ; j++) {
			System.out.println(j);
		}
		in.close();
	}

}
