package model;

import java.util.List;

public interface SaveLoadService {
	public SaveVO searchSlot(int [] saveslot);
	public List<SaveVO> getSlots();
	public int updateSlot(int[] saveslot,String board);
}
