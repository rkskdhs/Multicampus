package b_operator;
import java.util.Scanner;
public class Ex05_GeneralLogical {
	
	public static void main(String[] args) {
//		int 성적 = 75;
//	    char 태도 = 'A';
//	if(성적>=80 || 태도 =='A') {
//		System.out.println("우등상 수상");
//	}
//
//	
//	if(성적>=80 & 태도 =='A');
//	System.out.println("최우수상 수상");
//	}

	Scanner in = new Scanner(System.in);//타입 이름 변수-> 이름을 같게
	char c;
	c = in. nextLine().charAt(0);
	if(c>='A' && c<='Z') {
		System.out.println("대문자");
	if(c>='a' && c<='z') {
		System.out.println("소문자");
	}
	}
	in.close();
	
	}
}
