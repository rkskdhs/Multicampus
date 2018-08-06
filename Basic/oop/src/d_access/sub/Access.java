package d_access.sub;

public class Access {

	public static void main(String[] args) {
		private 		String a = "Private Data";
		public 		String b = "Public Data";
		protected 	String c = "Protected Data";
						String d = "Default";
		
		public void output() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		//접근 지정자
		//private :해당 클래스 내에서만 이용가능( 다른 클래스라면 무조건 접근 불가)
		//public :항상 어디서든 접급 가능
		//protected : 동일 패키지에서 접근 가능
		//                다른 패키지인 경우 자식 클래스에만 가능
		//default : 해당 패키지 내에서 접근가능
	}
}
