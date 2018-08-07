package homework;

public class CompactDisc extends Product {
	private String title;
	private String singer;
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(int productID, String description, String producer, int price, String title, String singer) {
	super(productID, description, producer, price);
	this.title = title;
	this.singer = singer;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("제목: "+ title);
		System.out.println("가수: "+ singer);
	}
}
