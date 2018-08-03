package e_Method;

public class Ex03_CallByReference {
	static void add(StringBuffer a, StringBuffer b .a.append(b)) {
	System.out.println("A=" +a+",B="+b);
}
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("불금");
		StringBuffer b = new StringBuffer("맛점");
	//	add(a,b);
		System.out.println("A=" +a+",B="+b);
	}
}
//주소를 넘기는 것 주소를 타고 가서 편집시 원본에 영향을 미친다.
//복사본을 넘기고 수정하는 것은 편집시 원본에 영향을 미치지 않음.