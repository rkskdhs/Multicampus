package garbage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OthelloVO {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		
		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = "select *from gameBoard ";
		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			System.out.println(rs + "print");
			
			//rs를 dao로 보내야하나??
			
		}catch(SQLException e) {
			 e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
			System.out.println("++++++main end+====");
		}


		
		
	}

}



