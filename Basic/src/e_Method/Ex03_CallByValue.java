package e_Method;

public class Ex03_CallByValue {

	public static void main(String[] args) {
		int a = 10, b = 3;
		add(a, b);
		System.out.println("A=" +a+",B="+b);
	}
	static void add(int a, int b) {
		a+=b;
		System.out.println("A=" +a+",B="+b);
	}
}
