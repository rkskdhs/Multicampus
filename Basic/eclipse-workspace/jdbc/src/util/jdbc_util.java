package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_util {//������ ���̽� Ŀ�ؼ� ����

	public static Connection getConnection(){
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";
		
		Connection con = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return con;
	}
	public static void close(ResultSet re, Statement st, Connection con) {//���� �ݳ�
		try {
			if(re != null) re.close();
			if(st != null) st.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
