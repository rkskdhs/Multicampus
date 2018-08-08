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
		
//		//Ddal d2 = new umma(); -> 에러
//		umma u2 = new Ddal();
//		u2.job();
//		//u2.study(); -> 에러
//		u2.gene();// -> overriding 수정했다는 의미를 가지고 있어 자식의 것을 가져옴
		
		//형변환 -(casting) 참조형은 형변환 안되요
		//기본형끼리
		//int-> String String.valueOf()
		//단 상속관계에서는 참조형도 가능
		
		//umma a = new umma();
		//Ddal b = (Ddal)a;
		
//		Ddal c = new Ddal();
//		umma d = (umma)c;
//		Ddal e = (Ddal)c;
		
		
		//연산자 : instanceof 
		Ddal z = new Ddal();
		if( z instanceof Ddal) {
			System.out.println("딸객체");
			
		}
		if( z instanceof umma) {
			System.out.println("엄마객체"); //이미 
		}
		if( z instanceof Object) {
			System.out.println("object객체");
	}

}
