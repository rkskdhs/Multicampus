package emptsesttemp;

import javax.swing.JOptionPane;

public class EmpTest {

	public static void main(String[] args) {

		EmpManager emp = new EmpManager();
		String title = JOptionPane.showInputDialog("�˻� ������ �Է�");
		
		String[] data = {"title"};
		emp.printEmployee(data);
		
		
	}

}
