package d_array;

public class Ex06_lotto_practice {

	public static void main(String[] args) {
		int lotto [][] = new int [5][6];

		for(int i = 0; i<lotto.length; i++) { //lotto length와 lotto[i] length의 차이??
			for(int j = 0; j<lotto[i].length; j++) {//왜 i의 랭스 까지??
				lotto[i][j] =(int)(Math.random()*45+1);


				for(int n = 0; n<lotto[j].length; n++) {

					if(lotto[i][j] == lotto[i][n]) {
						j--;
						break; //같은 경우 break하고 다시 랜덤 수 출력
					}
				}

			}
		}
		for(int i = 0; i<lotto.length; i++) {
			for( int j = 0; j< lotto[i].length; j++) {
				System.out.print(lotto[i][j]+ " ");
			}
			System.out.println();
		}
	}

}


