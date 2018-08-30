package model;

import java.sql.Array;
import java.util.List;

public class SaveLoadServiceImpl implements SaveLoadService{
	
	private SaveDAO dao = null;

	
	
	public SaveLoadServiceImpl() {
		super();
	}

	public SaveLoadServiceImpl(SaveDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<SaveVO> getSlots() {
		System.out.println("sadas");
		// TODO Auto-generated method stub
		return dao.getSlots();
	}


	@Override
	public SaveVO searchSlot(int[] saveslot) {
		// TODO Auto-generated method stub
		return dao.searchSlot(saveslot);
	}

	@Override
	public int updateSlot(int[] saveslot, String board) {
		// TODO Auto-generated method stub
		return dao.updateSlot(saveslot, board);
	}
	
	

}
