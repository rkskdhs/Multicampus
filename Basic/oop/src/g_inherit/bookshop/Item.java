package g_inherit.bookshop;

public class Item {
	protected String num,title;
	
	public Item() {
		System.out.println("기본 부모 생성자");
	}
	public Item(String num, String title) {
		this.num =num;
		this.title = title;
		System.out.println("인자 부모 생성자");
	}
	public  void output() {}//오버라이딩을 위한 함수
	
}
