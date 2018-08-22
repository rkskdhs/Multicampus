package emptsesttemp;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmpTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EmpManager emp = new EmpManager();
				
		while(true) {
			System.out.println("=================================");
			System.out.println("============사원 관리앱============");
			System.out.println("=================================");
			System.out.println("<<원하는 메뉴 번호 입력하라>>");
			System.out.println("1.사원 등록");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 수정");
			System.out.println("4.job_title검색 기능");
			System.out.println("9.앱종료");
			
			String menu = in.nextLine();			
			
			switch (menu.charAt(0)) {
			case '1' :
				break;
			case '2' :
				break;
			case '3' :
				break;
			case '4' :
				System.out.println("job_title 검색을 시작합니다");
				
				String title = JOptionPane.showInputDialog("검색 데이터 입력");
				String[] data = {title};
				emp.printEmployee(data);
				break;
			case '9' :
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default  :
				System.out.println("번호를 확인하세요");
				break;
			
			}
			
		}
		
	}

}
