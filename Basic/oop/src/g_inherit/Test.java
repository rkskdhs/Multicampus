package g_inherit;

public class Test {

	public static void main(String[] args) {
//		umma u = new umma();
//		u.job();
//		u.gene();
//		
//		Ddal d = new Ddal();
//		d.study();
//		d.gene();
//		d.job(); //부모 클래스의 메소드 사용
		
		//Ddal d2 = new umma(); -> 에러
		umma u2 = new Ddal();
		u2.job();
		//u2.study(); -> 에러
		u2.gene();// -> overriding 수정했다는 의미를 가지고 있어 자식의 것을 가져옴
	}

}
