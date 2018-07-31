package b_operator;

public class Ex02_Not {
/*not 결과의 반대로 하는 연산자
 * 일반 논리 not - ! -->boolean
 * 이진 논리 not - ~ -->
 * 
 * 
 */
	public static void main(String[] args) {
	    //일반 논리
		boolean result = 3<2;
	    		System.out.println(result);
	    		System.out.println(!result);

	    //이진논리
	    int a = 15;
	    //00000000 00000000 00000000 00001111
	    //11111111 11111111 11111111 11110000
	    System.out.println(~a);
	}

}
