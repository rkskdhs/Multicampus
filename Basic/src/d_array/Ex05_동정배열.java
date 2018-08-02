package d_array;

public class Ex05_동정배열 {

	public static void main(String[] args) {
		char[][] star = new char[5][5];
		
		for (int i = 0; i<star.length; i++) {
			star[i] = new char[i+1];
			for(int j = 0; j<i+1; j++) {//5.5해놓으면 불필요하게 메모리가 잡히는 경우가 있음
				star[i][j]='*';
			}
		}
		
		for (int i = 0; i<star.length; i++) {
			for(int j = 0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

	}

}
