package c_Control;
import java.util.Scanner;
public class Ex12_Homework_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		for(int i=1 ; i<= h ; i++){
			if(i %2== 1) {
				for(int j = 1; j<=w ; j++) {
					System.out.print(j+" ");
				}
			} 
			else if (i%2==0) {	
				for(int j =2*w ; j<=w+1 ; j--){
					System.out.print(j+" ");
				}
			}
             System.out.println();  
		}

	}
}