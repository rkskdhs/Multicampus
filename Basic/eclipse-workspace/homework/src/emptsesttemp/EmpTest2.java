package emptsesttemp;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EmpTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EmpManager emp = new EmpManager();
				
		while(true) {
			System.out.println("=================================");
			System.out.println("============��� ������============");
			System.out.println("=================================");
			System.out.println("<<���ϴ� �޴� ��ȣ �Է��϶�>>");
			System.out.println("1.��� ���");
			System.out.println("2.��� ���� ����");
			System.out.println("3.��� ���� ����");
			System.out.println("4.job_title�˻� ���");
			System.out.println("9.������");
			
			String menu = in.nextLine();			
			
			switch (menu.charAt(0)) {
			case '1' :
				break;
			case '2' :
				break;
			case '3' :
				break;
			case '4' :
				System.out.println("job_title �˻��� �����մϴ�");
				
				String title = JOptionPane.showInputDialog("�˻� ������ �Է�");
				String[] data = {title};
				emp.printEmployee(data);
				break;
			case '9' :
				System.out.println("�����մϴ�");
				System.exit(0);
				break;
			default  :
				System.out.println("��ȣ�� Ȯ���ϼ���");
				break;
			
			}
			
		}
		
	}

}
