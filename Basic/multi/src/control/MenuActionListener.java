package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Othello;

public class MenuActionListener implements ActionListener {

	Othello othello;
	
	private String[] fileMenu;
	
	public MenuActionListener(){}
	public MenuActionListener(Othello othello){
		this.othello = othello;
		fileMenu = othello.filemenu_String;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals(fileMenu[0])) {
			othello.gameInit();
		}
		else if(cmd.equals(fileMenu[1])) {
			new garbage.OthelloDao();
		}
		else if(cmd.equals(fileMenu[2])) {
			new garbage.OthelloVO();
		}
		else if(cmd.equals(fileMenu[3])) {
			System.exit(0);
		}
	}
}