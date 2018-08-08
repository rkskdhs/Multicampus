package i_Final;
class parent{
	String field = "부모님께";
	public void jib() {
		System.out.println("부모님이 만드신 집");
	}
}
final class child extends parent{
	child(){
		field = "내꺼";
	}
	 public void jib() {
		System.out.println("물려받은 집");
	}
}
public class Test {

	public static void main(String[] args) {
		parent p = new child();
		System.out.println(p.field);
		p.jib();
	}
}


/* final 변경 불가
 *       -변수	:값변경이 안됨
 *       -메소드 : overriding을 막음
 *       -클래스 :
 * 
 */
*/