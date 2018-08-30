package model;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class SaveDAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	public SaveVO searchSlot(Object[] saveslot) {
		System.out.println("첫번째");
		int[][] gameBoard = null;

		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				//2차원 배열의 원소를 1차원 배열의 원소로 이동.
				saveslot[( i * gameBoard[i].length ) + j ] = gameBoard[i][j];
			}
		}


		String sql ="insert into BoardDB valuse(?,?)";
		SaveVO slot = null;
		try {
			con = JdbcUtil.getConnection();
			Array tmp = con.createArrayOf("INTEGER", saveslot);
			ps = con.prepareStatement(sql);
			ps.setArray(1, tmp);
			rs = ps.executeQuery();
			// 결과 값 핸들링
			while(rs.next()) {
				slot = new SaveVO();
				slot.setTmp(rs.getArray("Board"));
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, ps, con);
		}

		return slot;
	}
	public List<SaveVO> getSlots(Object[] saveslot){
		System.out.println("두번째");
		
		int[][] gameBoard = null;
		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				//2차원 배열의 원소를 1차원 배열의 원소로 이동.
				saveslot[( i * gameBoard[i].length ) + j ] = gameBoard[i][j];
			}
		}

		String sql ="select *  from saveothello order by saveslot";
		List<SaveVO> list = new ArrayList<SaveVO>();
		SaveVO slot = null;
		try {
			con = JdbcUtil.getConnection();
			Array tmp = con.createArrayOf("INTEGER", saveslot);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			// 결과 값 핸들링
			while(rs.next()) {
				slot = new SaveVO();
				slot.setTmp(rs.getArray("Board"));
				list.add(slot);
			}

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, ps, con);
		}
		return list;
	}

	public List<SaveVO> getSlots() {
		// TODO Auto-generated method stub
		return null;
	}
	public SaveVO searchSlot(int[] saveslot) {
		// TODO Auto-generated method stub
		return null;
	}
	public int updateSlot(int[] saveslot, String board) {
		// TODO Auto-generated method stub
		return 0;
	}
}	


