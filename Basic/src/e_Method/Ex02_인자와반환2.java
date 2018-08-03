package e_Method;

public class Ex02_인자와반환2 {

	public static void main(String[] args) {
		
		int a = 20, b = 5;
		add(a,b);
		int result =method();
		//m,n의 합을 여기서, return은 하나의 값만 가능
		System.out.println("r=" +result);
		
		int[] re = method2();
		System.out.println(re[0] + re[1]);
		
		
	}
	static int[] method2() { //void는 받을 값의 타입, 배열등 표현
		int z = 100, y = 200;
		int[] result = new int[2];//두개를 동시에 받을 수 있는 배열
		result[0] = z;
		result[1] = y;
		return result;
	}
	static int method() {
		int n = 10, m = 7;
		int result = n+m;
		return result;
	}
	static void add(int a, int b) {//변수명을 다르게 해도 상관 없어요
		//main의 안에 있는 a,b를 여기서 합구하고 출력
		System.out.println(a+b);
	}

}
