package c_Control;


public class Ex02_If_학번 {

	public static void main(String[] args) {
		String id = "02015112365";
		String Hakbun = id.substring(1,5);
		char College = id.charAt(5);
		String Major = id.substring(6,8);
		System.out.print(id+"는"+Hakbun+"년에 입학한 학생이고 ");
		if(College=='1') {
			if(Major.equals("11")){
				System.out.println("공대 컴퓨터 학과입니다.");
			}else if(Major.equals("12")) {
				System.out.println("공대 소프트웨어학과입니다");
			}else if(Major.equals("13")){
				System.out.println("공대 모바일학과입니다");
			}else if(Major.equals("22")){
				System.out.println("공대 자바학과입니다.");
			}else if(Major.equals("33")){
				System.out.println("공대 서버학과입니다");
			}
		}else if(College=='2') {
			if(Major.equals("11")) {
				System.out.println("사회대 사회학과입니다.");
			}else if (Major.equals("12")) {
				System.out.println("사회대 경영학과입니다.");
			}else if (Major.equals("13")) {
				System.out.println("사회대 경제학과입니다.");
			}
		}


	}
}


