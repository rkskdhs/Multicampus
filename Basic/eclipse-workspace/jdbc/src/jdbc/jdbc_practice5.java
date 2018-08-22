package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.jdbc_util;

public class jdbc_practice5 {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = 
				"insert into book(bookid, title, price) " + 
				"values((select nvl(max(bookid),0)+1 from book), ?, ?) ";

		String date = JOptionPane.showInputDialog("책제목/가격");
		String[] book = date.split("/");
		
		
		
		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			
			// 값세팅
			
			ps.setString(1, book[0]);
			ps.setInt(2, Integer.parseInt(book[1]));
			
			int result = ps.executeUpdate();
			
			System.out.println(result + "book테이블에 등록됨");
			
			//결과값 핸들링
			
		}catch(SQLException e) {
			// e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
			System.out.println("++++++main end+====");
		}


		
		
	}	
}
