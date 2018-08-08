package g_inherit.bookshop;

public class abstract Item {
	protected String num,title;
	
	public Item() {
		System.out.println("기본 부모 생성자");
	}
	public Item(String num, String title) {
		this.num =num;
		this.title = title;
		System.out.println("인자 부모 생성자");
	}
	public abstract void output();//오버라이딩을 위한 함수
	//abstract-> 미완성
	//			-> overriding 강제성 abstract 가 나오기 위해서는 부완전하기 때문에 자식 클래스에서 완전하게 해야함
	//		-> 다형성
}
