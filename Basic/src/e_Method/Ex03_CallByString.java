package e_Method;

public class Ex03_CallByString {

	public static void main(String[] args) {
		String a = new String("불금");
		String b = new String("맛점"); //String은 조그만 변화에도 메모리를 새로 잡아서 만든다 
		add(a,b);
		System.out.println("A=" +a+",B="+b);
	}
	static void add(String a, String b) {
		a+=b;
		System.out.println("A=" +a+",B="+b);
	}
}
