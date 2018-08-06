package d_access.sub;

public class Practice {

	private int n, a[];
	private int sum;
	private double avg;

	public Practice (int id, int a[]) {
		this.n = id;
		this.a = a;
	}
	
	public void calTotal(){
		sum = a[0] + a[1] + a[2];
	}

	public void calAverage(){
		avg = sum/3;
	}
	
	//getter
	public int getN() {
		return n;
	}

	public int[] getA() {
		return a;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}
	// setter

	public void setN(int n) {
		this.n = n;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	


}
