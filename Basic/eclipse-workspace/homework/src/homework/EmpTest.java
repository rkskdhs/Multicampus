package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.jdbc_util;

public class EmpTest {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String pw = "hr";

		String sql = "select count(e.employee_id)����, m.employee_id �Ŵ���, m.last_name �̸�\r\n" + 
				" from employees e, employees m\r\n" + 
				" where e.manager_id = m.employee_id\r\n" + 
				"  group by m.employee_id, m.last_name\r\n" + 
				"  having count(*)>=8";  
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		// System.out.println(con);
		
		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			
			// ��?
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.print("����" +"\t");
				System.out.print("������" + "\t");
				System.out.print("�̸�" + "\n");
			}
			//����� �ڵ鸵
			
		}catch(SQLException e) {
			// e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
			System.out.println("++++++main end+====");
		}


		
		
	}	
}

