package jdbc;
import java.sql.*;
public class jdbc_practice {

	public static void main(String[] args) {
		System.out.println("main start");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";
		String pw = "TIGER";

		String sql = "Select * from emp";
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;

		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.connection 할당
			con = DriverManager.getConnection(url, user, pw);
			//3.sql문을 관리하는 statement 객체 생성
			st = con.createStatement();
			//4.sql구문 실행
			rs= st.executeQuery(sql);
			//5. 결과값 핸들링
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getDate("hiredate")+"\n");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC DRIVER 확인 요망");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("url, pw, user 확인");
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

