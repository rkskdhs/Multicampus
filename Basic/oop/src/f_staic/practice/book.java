package f_staic.practice;

public class book {
	private String number;
	private String title;
	private String author;
	private boolean borrow;
	private static int count;
	
	public book() {
		
	}
	public book(String number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
		count++;
	}
	
	public book(String number) {
		this(number, "무제", "저자 미상");//this()-> 함수를 연결하는 건가??
		
		
	}
	
	void output() {
		System.out.println(number + "/" + title +"~~");
		
	}
	
	static int getCount() {
		return count;
	}
	

}
