package practice_0801;
import java.util.Scanner;
public class Ex13_practice {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	int n = in.nextInt();

	for(int i =1 ; i<= n ; i++ ) {
		for(int j = i ; j<= n*n ; j+=n) {

			System.out.print(j+" ");

		}System.out.println();
	}in.close();

}
}

