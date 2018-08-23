package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.jdbc_util;
import vo.Bookvo;

public class BookDao {

	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public int insertBook(String title, int price) {

		return 0;
	}
	public int deleteBook(int bookid, int price) {

		return 0;
	}
	public List<Bookvo> searchBook(String title, int price) throws Exception{
		String sql = 
				"insert into book(bookid, title, price)"+
						"values((select nvl(max(bookid),0)+1 from book),?,?)";

		con= jdbc_util.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setInt(2, price);

		int row = ps.executeUpdate();


		return null;
	};


	public Bookvo searchBook(int bookid) {

		return null;
	}
	public List<Bookvo> getbooks(){

		String sql = "select * from book";
		List<Bookvo> list = new ArrayList<>();
		Bookvo book = null;

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


		}catch(SQLException e) {
			 e.printStackTrace(); 
		}finally {
			jdbc_util.close(rs, ps, con);
		}return null;
	}
	public int updatebook(int bookid) {

		return 0;

	}
}
