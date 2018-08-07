package e_Static;

public class Book {
	
	private static int count;
	int a;
	
	public void method() {
		System.out.println(count);
		System.out.println(a);
	}

	public static int getCount() {
		//count = 10;
		//a = 20;
		return count;
	}
	
	public Book() {
		count++;
		System.out.println("책 한개 생성");
	}
}
