package model;

import java.sql.Array;

public class SaveVO {
	private int[] saveslot;
	private String board;
	private String savedate;
	
	
	
	
	public SaveVO() {
		super();
	}

	public SaveVO(int [] saveslot, String board, String savedate) {
		super();
		this.saveslot = saveslot;
		this.board = board;
		this.savedate = savedate;
	}

	public int [] getSaveslot() {
		return saveslot;
	}

	public void setSaveslot(int [] saveslot) {
		this.saveslot = saveslot;
	}

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public String getSavedate() {
		return savedate;
	}

	public void setSavedate(String savedate) {
		this.savedate = savedate;
	}

	@Override
	public String toString() {
		return "SaveVO [saveslot=" + saveslot + ", board=" + board + ", savedate=" + savedate + "]";
	}

	public void setTemp(Array array) {
		// TODO Auto-generated method stub
		
	}

	public void setTmp(Array array) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
}
