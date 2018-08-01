package c_Control;

public class Ex05_for_개념 {

	public static void main(String[] args) {
		//1부터 10까지 합을 출력
		int sum = 0;
		for(int i = 1 ; i <= 10;i++) {
			sum +=i;
		}
		System.out.println("sum="+sum);
		
		int odd = 0;
		int even = 0;
		for(int i = 1 ; i <=100; i+=2) {
			odd +=(i+1);
			even +=i;
		}
		System.out.println("odd="+ odd);
		System.out.println("even="+ even);
		
		//A~Z출력
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		for(char i = 'Z'; i>='A' ; i--) {
			System.out.print(i);
		}
	}

}
