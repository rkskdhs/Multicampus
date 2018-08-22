package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import util.jdbc_util;

public class jdbc_practice4 {

	public static void main(String[] args) {
		System.out.println("main start");
		//con할당
		Connection con = null;
		con = jdbc_util. getConnection();
		//자원 반납
		System.out.println(con);
		jdbc_util.close(null, null, null);
		System.out.println("main close");
		
		
	}

}
