package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		int kor;
		kor = 60;
		int eng = 30; //초기화

				
		if(kor == eng) {
			System.out.println("두점수 동일");
		} else {
			System.out.println("두 점수가 다름");
		}
		//국어랑 영어 점수 변환
		
		    System.out.println("국어:"+kor + ",영어"+ eng);
		   int temp = kor;
		   kor = eng;
		   eng = temp;
		   System.out.println("국어:"+kor + ",영어"+ eng);
				   
		   
	}

}
