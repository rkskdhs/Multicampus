package emptsesttemp;

import javax.swing.JOptionPane;

public class EmpTest {

	public static void main(String[] args) {

		EmpManager emp = new EmpManager();
		String title = JOptionPane.showInputDialog("검색 데이터 입력");
		
		String[] data = {"title"};
		emp.printEmployee(data);
		
		
	}

}
