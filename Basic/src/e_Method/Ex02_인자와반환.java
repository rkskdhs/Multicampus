package e_Method;
import java.util.Scanner;
public class Ex02_인자와반환 {

	public static void main(String[] args) {

		String result=input(i);
		output(result);//인자;// 제어권을 가져갈때 다른 애들도 데려간다
	}
		//입력 역할 메소드
		static String input() {
			Scanner in = new Scanner(System.in);
			System.out.println("인사말 입력->");
			String i = in.nextLine();
			return i;                        //데이터 반환의 의미 나를 부른 곳으로 반환
			//출력 역할 메소드
			static void output(String i) {//타입과 변수로 받을 준비-파라미터 
				//꼭 i라는 변수를 보낼 필요는 없어 문자를 다르게 해도 상관은 없다
				System.out.println(i);
			}
		}
	}
