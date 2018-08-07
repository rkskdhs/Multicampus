package d_access.sub;

public class Practice {

	private int n, a[];
	private int sum;
	private double avg;

	public Practice (int id, int a[]) { //여기에는 합이나 평균은 입력받는 것이 아니니 필요 없어
		this.n = id;
		this.a = a;
	}
	
	public void calTotal(){
		sum = a[0] + a[1] + a[2];//여기서 계산 값을 구해주는 것
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
