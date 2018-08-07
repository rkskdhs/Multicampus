package g_inherit.bookshop;

public class Book extends Item {
	String publisher, writer;
	public Book() {
		super();//안써도 default임
		System.out.println("기본자식 생성");
	}
	public Book(String num, String title, String publisher, String writer) {
		super(num,title);
		this.publisher = publisher;
		this.writer = writer;
		System.out.println("인자 자식 생성자");
	}
	public  void output() {
		System.out.println("번호"+num);
		System.out.println("제목"+title);
		System.out.println("출판사"+publisher);
		System.out.println("작가"+writer);
	}

}
