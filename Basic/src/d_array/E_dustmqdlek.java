package d_array;

public class E_dustmqdlek {

	public static void main(String[] args) {
		int a[][]=new  int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21,-21, -35, -93, -11}, {9, 14, 39, -98}};

		int [] total = new int[4];
		for(int i = 0; i<a.length; i++) {
			int tmp=0;
			for(int j = 0; j<a[i].length; j++) {
				tmp += a[i][j];
			}
			total[i] =tmp;
		}
		for(int k = 0; k<total.length; k++);{
			
		}
		
	}

}
