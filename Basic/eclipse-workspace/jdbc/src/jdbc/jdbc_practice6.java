package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.jdbc_util;

public class jdbc_practice6 {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "delete from book where bookid = ? ";

		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			
			// 값세팅?가 있을 경우
			
			ps.setInt(1, 1);
			
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "row delete");
			
			//결과값 핸들링
			
		}catch(SQLException e) {
			// e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
			System.out.println("++++++main end+====");
		}


		
		
	}

}
