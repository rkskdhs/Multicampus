package e_Method;

public class Ex04_Overloading {

	public static void main(String[] args) {
		
		String str = "홍길순";
		StringBuilder sb = new StringBuilder("홍길자");
		char[] ch = new char [] {'홍', '길', '자'};
		add(str);
		add(sb);
		add(ch);
	}
	static void add(char [] s) {
		String temp = new String(s); //char를 string으로 변환 확인 하시라.
		temp += "화이팅!!";
		System.out.println(temp);
	}
	static void add(StringBuilder s) {
		s.append("화이팅!!");
		System.out.println(s);
	}
	static void add(String s) {
		s += "화이팅!!";
		System.out.println(s);
	}
}
//overloading
//동일한 이름의 함수들(동일한 역할의)
//인자의 자료형이나 개수가 다름