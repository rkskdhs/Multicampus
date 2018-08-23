package vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.jdbc_util;

public class jdbc_practice7 {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		//String sql = "update book set price = 8000000 where bookid = 1 ";
		String sql = "update book set title = ?, price = ? where bookid = ? ";
		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			
			// ������?�� ���� ���
			
			ps.setString(1, "�Ƹ���");
			ps.setInt(2, 950);
			ps.setInt(3, 1);
			int result = ps.executeUpdate();
			
			System.out.println(result + "row update");
			
			//����� �ڵ鸵
			
		}catch(SQLException e) {
			// e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
			System.out.println("++++++main end+====");
		}


		
		
	}

}
