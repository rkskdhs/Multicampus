package emptsesttemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.jdbc_util;

public class EmpManager {

		public void printEmployee(String jobs[]) {
			System.out.println("+++++main start+++++");
			String driver = "oracle.jdbc.OracleDriver";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String pw = "hr";

			
			Connection con =null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			
			String sql ="select j.job_title 직업, e.employee_id 사번, "+
						"e.first_name 이름, e.salary 연봉 "+
						" from employees e, jobs j "+
						" where e.job_id = j.job_id "+
						" and lower(j.job_title) like ? ";
			

			
			try {
				con = jdbc_util.getConnection();
				ps = con.prepareStatement(sql);
				
				// 값?
				ps.setString(1, "%"+jobs[0].toLowerCase()+"%");
				rs = ps.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString("직업") + "\t");
					System.out.print(rs.getString("사번")+ "\t");
					System.out.print(rs.getString("이름")+ "\t");
					System.out.print(rs.getString("연봉") + "\t");
					
				}
				//결과값 핸들링
				
			}catch(SQLException e) {
				 e.printStackTrace(); 
			}finally {
				jdbc_util.close(rs, ps, con);
				System.out.println("++++++main end+====");
			}

		}
}
