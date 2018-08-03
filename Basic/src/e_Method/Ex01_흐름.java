package e_Method;

public class Ex01_흐름 {

	public static void main(String[] args) {
		System.out.println("1");
		method();//메소드를 불렀다가 다시 제어권 반환으로 돌아옴
		System.out.println("3");//프로그램의 시작은 무조건 main으로 jvm이 찾아감, 위아래 상관없음

	}
	static void method() {
		System.out.println("2");
	}
	//void 값 반환 할거 없음, class 파일은 바이트코드 jvm이 인식하는 파일
	
	
}
