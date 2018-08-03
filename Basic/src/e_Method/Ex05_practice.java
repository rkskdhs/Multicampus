package e_Method;
import java.util.Scanner;
public class Ex05_practice {

	public static void main(String[] args) {
		
		char [][] arr = input();
		output(arr);

	}
	static void output(char [][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	static char [][] makeSquare(int a, int b, char c) {
		char[][] ch= null;
		char[][] arr = new char[a][b];
		for (int i=0; i<a; i++) {
			for(int j = 0;j<b; j++ ) {
				if(c>'z') {
					c='A';
				}
				arr [i][j]= c;
				c++;
	
			}
		}
		return arr;
	}
	static char [][] input() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		char c = in.nextLine().charAt(1);
		in.close();
		
	   char [][] arr = makeSquare(a,b,c);
	   
	   return arr;
	   
	}
}

// 