package b_operator;

public class Ex10_Assignment {

	public static void main(String[] args) {
		int a = 10, b=7;
		
		a = a + b;// a+=b;
		System.out.println("A="+a+",B="+b);
		a = 10;
		b=7;
		a-=b; //3 7
		System.out.println("A="+a+",B="+b);
		a = 10;
		b=7;
		a*=b;// 70 7
		System.out.println("A="+a+",B="+b);
		a = 10;
		b=7;
		a/=b;//1 7
		System.out.println("A="+a+",B="+b);
		a = 10;
		b=7;
		a%=b;//3 7
		System.out.println("A="+a+",B="+b);
	}// 코딩은 연결되어있다 !!!!!!!!

}
