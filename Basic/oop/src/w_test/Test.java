package w_test;

public class Test {

	public static void main(String[] args) {
		Object [] data = method();//받아주는 함수
		for(int i = 0; i<data.length ; i++) {
			System.out.println(data[i].toString());
		}
		
	}
	static Object [] method() {
		String name = "홍길동";
		int age = 29;
		double height = 170.09;
		Object[] data = new Object[3];
		data[0] = name;
		data[1] = new Integer(age);
		data[2] = new Double(height);
		
		return data;
		
	}
}
// 클래스에 있는 변수를 field 메소드에 있는 것이 variable