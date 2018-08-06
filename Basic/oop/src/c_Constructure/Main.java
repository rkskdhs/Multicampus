package c_Constructure;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("이름과 성적을 입력하시오 ->");
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		int kor = in.nextInt();
		int eng = in.nextInt();
		int mat =  in.nextInt();
		
		Student s = new Student();// 변수 선언및 객체 생성
//		s.setName(name);
//		s.setKor(kor);
//		s.setEng(eng);
//		s.setMat(mat);
		//class객체안에서는 .사용, 하나하나 지정해주는 것
		
		
		//초기화 - 객체화(객체 생성시 초기화 시키기)
		//Student s = new Student(name, kor, eng, mat);
		
		
		s.calTotal();
		s.calAvg();
		
		
		System.out.println(s.getName() + "님 총점" + s.getTotal());
		System.out.println(s.getName() + "님 총점" + s.getAvg());
	in.close();
	}

}
