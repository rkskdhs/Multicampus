package practice_0801;

public class Ex04_for {

	public static void main(String[] args) {
		for(int i = 1 ; i<=10 ; i++) {
			for(int j = 1 ; j<=11-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
