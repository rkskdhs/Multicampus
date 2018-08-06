package A_Basic;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();// 변수 선언및 객체 생성
		
		s.name = "홍길자";
		s.kor = 99;
		s.eng = 88;
		s.mat = 95;
		//class객체안에서는 .사용
		
		s.calTotal();
		s.total = 100;//의도적으로 값 변형
		s.calAvg();
		
		
		System.out.println(s.name + "님 총점" + s.total);
		System.out.println(s.name + "님 총점" + s.avg);
	}

}
