package a_datatype;

public class Ex06_StringBuffer {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("홍길동");
		StringBuffer b = new StringBuffer("홍길동");
		b.append("2");
		if( a.equals(b)) {
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}

	}

}
