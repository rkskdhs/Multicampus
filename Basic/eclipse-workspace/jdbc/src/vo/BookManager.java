package vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc_util;

public class BookManager {
	public static List getBook() {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";


		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Bookvo book = null;
		
		String sql = "select * from book";

		List<Bookvo> list = new ArrayList<>();
		try {
			con = jdbc_util.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			
			while(rs.next()) {
				book = new Bookvo();
				book.setBookid(rs.getInt("bookid"));
				book.setTitle(rs.getString("Title"));
				book.setPrice(rs.getInt("Price"));
				book.setPubdate(rs.getDate("pubdate").toString());
				list.add(book);
				System.out.println(book);
			}

			//결과값 핸들링

		}catch(SQLException e) {
			 e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);


			System.out.println("++++++main end+====");
		}

		return list;


	}

}
