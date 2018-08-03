package e_Method;

public class Ex04_WrongOverloading {

	public static void main(String[] args) {


	}
	static void method1(int no) {
		String s = "행복" + no;
		System.out.println(s);
		return s;
	}
	static void method2(int a) {
		StringBuffer sb = new StringBuffer("불금");
		sb.append(a);
		System.out.println(a);
		return sb;
	}
}
