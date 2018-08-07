package homework;

public class Product {
	private int productID;
	private String description, producer;
	private int price;
	
	public Product() {
		
	}
	public Product(int productID, String description, String producer, int price) {
		this.productID = productID;
		this.description = description;
		this.producer = producer;
		this.price = price;
	}
	public void showInfo() {
		System.out.println("상품의 고유 식별자:" + productID);
		System.out.println("상품의 설명: "+ description);
		System.out.println("생산자: "+ producer);
		System.out.println("가격: "+ price);
		
	}
}
