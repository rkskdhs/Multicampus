package day_08_27;

public class recursive {

	public static void main(String[] args) {

	//System.out.println(test("100000001111000",3));
		System.out.println(fib(30));
	}


	public static void f1(int n ) {
		if(n>0) f1(n-1);//끝나면 별찍고 종료
		System.out.println("*");
	}
	public static void f2(int n) {
		if(n>0)  f2(n-1);
		System.out.println(n);
	}
	public static void f3(int n) {
		System.out.println(n);
		if(n>0)  f3(n-2);
		System.out.println(n);
	}
	public static void f4(int n) {
		if(n>0) f4(n/2);
		System.out.print(n%2);
		
	}
	public static int test(String msg, int idx) {
		if(idx<0) return 0;
		if(msg.charAt(idx) == '0')
			return 2*test(msg,idx-1);
		return 1+2*test(msg,idx-1);
	}
	
	public static int fib(int n) {
		if(n==1 ||n==2) return 1;
		return fib(n-1)+fib(n-2);
		
	}
}