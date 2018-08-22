package jdbc;
import java.sql.*;

import javax.swing.JOptionPane;
public class jdbc_practice3 {

	public static void main(String[] args) {
		System.out.println("main start");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";
		
		
		String name = JOptionPane.showInputDialog("�˻��� �̸� ");
		//String sql = "Select * from emp where lower(ename) = ?";
		//String sql = "Select * from emp where lower(ename) like'%'||?||'%' ";
		String sql = "Select * from emp where lower(ename) like ?";
		
		
		
		
		Connection con =null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			//1.����̹� �ε�
			Class.forName(driver);
			//2.connection �Ҵ�
			con = DriverManager.getConnection(url, user, pw);
			//3.sql���� �����ϴ� statement ��ü ����
			//st = con.createStatement();
			ps = con.prepareStatement(sql);
			ps.setString(1,"%"+name.toLowerCase()+"%");
			//4.sql���� ����
			rs=ps.executeQuery();
			//5. ����� �ڵ鸵
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getDate("hiredate")+"\n");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC DRIVER Ȯ�� ���");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("url, pw, user Ȯ��");
		}finally {
			try {
				if(rs != null) 
				if(con!= null)con.close();

			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("connection:" + con);
		System.out.println("main end");
	}
}

