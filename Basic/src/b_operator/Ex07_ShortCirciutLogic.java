package b_operator;

public class Ex07_ShortCirciutLogic {

	public static void main(String[] args) {
		
		int a = 3;
		if(a>3 && ++a>3) {//이미 앞의 조건이 false니 뒤에는 실행하지 않음
			System.out.println("조건 만족");//not
		}
		System.out.println("A="+a);

		if(a>1 || ++a>3);{
		System.out.println("조건 만족 2");//short circuit 은 일반 논리에서 만
	    }//다시보기
		
	}
}