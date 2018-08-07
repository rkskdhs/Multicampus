package homework;

public class ConversationBook extends Book {

	private String language;
	
	public ConversationBook() {
		super();
	}
	public ConversationBook(int productID, String description, String producer, int price,int ISBN, String author, String title, String language) {
	super(productID, description, producer, price, ISBN, author, title);
	this.language = language;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("언어: "+ language);
	}
}
