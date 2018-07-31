package b_operator;
/* 숫자를 입력 받아 홀수 짝수 출력
 * scanner는 소속을 끌어와야됨
 */
import java.util.Scanner;
public class Ex03_Arithmetic {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("숫자입력->");
		int su =in.nextInt();
		//su를2로 나머지 연산에서 0이라면 짝수출력 아니면 홀수 == or !=
		if(su%2 != 0) {
			System.out.println("홀수");
		}else if(su%2 != 1){
			     System.out.println("짝수");
			     in.close();
			}
		}
	}
