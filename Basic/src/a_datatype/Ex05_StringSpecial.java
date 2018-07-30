package a_datatype;

public class Ex05_StringSpecial {

	public static void main(String[] args) {
		String a = "홍길자";
		String b = "홍길자";
		
		b = b + "여사님";
		
		if( a.equals (b) ) {
			System.out.println("이름이 동일");
		}else {
			System.out.println("다르다");
		}
		if( a==b ) {
			System.out.println("이름이 동일");
		}else {
			System.out.println("다르다");
		}

	}

}
