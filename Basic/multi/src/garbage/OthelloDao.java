package garbage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import view.Othello;


public class OthelloDao {

	public static void main(String[] args) {
		System.out.println("+++++main start+++++");
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String [] board;
		String user = "SCOTT";
		String pw = "TIGER";


		Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		int[][] gameBoard;
		int[] gameBoard1;
		String sql = "insert into BoardDB valuse(?) ";

		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				//2차원 배열의 원소를 1차원 배열의 원소로 이동.
				gameBoard1[( i * gameBoard[i].length ) + j ] = gameBoard[i][j];
			}
		}
		//1차원 배열 출력
		for(int i=0; i<gameBoard1.length; i++) {
			if(i%gameBoard[0].length==0) {
				System.out.println();
			}
			ps.setArray(i, gameBoard1);



			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, pw);
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch(SQLException e) {
				System.out.println(e.getMessage());
			}

			finally {
				jdbc_util.close(rs, ps, con);
				System.out.println("++++++main end+====");
			}

		}

	}

	public void setgameBoard(int [][]a){
		gameBoard = Othello.getBoard();
	}

	public int [][]getgameBoard(){
		return gameBoard;
	}

}


