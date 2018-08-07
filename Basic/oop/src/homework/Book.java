package homework;

public class Book extends Product{
	private int ISBN;
	private String author;
	private String title;
	
	public Book() {
		
	}
	public Book(int productID, String description, String producer, int price,int ISBN, String author, String title) {
		super(productID, description, producer, price);
		this.ISBN = ISBN;
		this.author = author;
		this.title = title;
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ISBN번호: "+ ISBN);
		System.out.println("저자명: "+ author);
		System.out.println("제목:" +title );
		
	}
}
