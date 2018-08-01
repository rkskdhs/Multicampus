package c_Control;
import java.util.Scanner;
public class Ex12_Homewhork {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		for(int i = 1; i<=h; i++  ){
			for(int j = 1; j<=w; j++){
				System.out.print(j+" ");

			}
		System.out.println();
		}
	} 
}