package b_Incapsulation;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Student s = new Student();// 변수 선언및 객체 생성
		System.out.println("이름과 성적을 입력하시오 ->");
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat =  in.nextInt();
		
		s.setName(name);
		s.setKor(kor);
		s.setEng(eng);
		s.setMat(mat);
		//class객체안에서는 .사용
		
		s.calTotal();
		//s.total = 100;//의도적으로 값 변형
		s.calAvg();
		
		
		System.out.println(s.getName() + "님 총점" + s.getTotal());
		System.out.println(s.getName() + "님 총점" + s.getAvg());
	in.close();
	}

}
