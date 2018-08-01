package c_Control;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Ex08_while_개념 {

	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1;
//		while( i <= 10) {//while은 조건문만 안에 두고 나머지는 밖으로 내버리는 for
//			sum +=i;
//			i++;
//		}
//		System.out.println("sum="+sum);
//
//		
		
		//숫자 2~9중 입력 구구단 출력.
		Scanner in = new Scanner(System.in); //scanner는 자료 형변환을 해줌
//		int gugu =0;
//		int j = in.nextInt();
//		for(int i =  ; i>=1 && i<=9 ; i++);{
//			gugu = i*j;
//		}
//		System.out.println(gugu);
		
		
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str,"/"); // "구분자" 해주면 띄어쓰기 외에도 사용.
		while(st.hasMoreTokens()) {//어디까지??
			String temp = st.nextToken();
			System.out.println(temp);
		}
		
		
		
	}

}
