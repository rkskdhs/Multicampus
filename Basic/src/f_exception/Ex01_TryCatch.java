package f_exception;

public class Ex01_TryCatch {

	public static void main(String[] args) {

		//오류 1. 에러:심각한 오류  2. 예외:심각하지 않은 오류->프로그램 비정상적인 종료
		//예외처리-> 프로그램을 정사 종료까지 끌고가기 위함

		String [] str = {"소고기", "양고기", "닭고기"};

		try {

			for(int i = 0; i<4; i++) {
				System.out.print(str[i]);
			}
				System.out.println("예외구문 발생여지 구문");
				return;
			}catch(Exception ex) {

				System.out.println("예외발생:" +ex.getMessage());
				ex.printStackTrace();
			}finally {
				System.out.println("무조건 수행");
			}

			System.out.println("프로그램 종료");
		
	}
}