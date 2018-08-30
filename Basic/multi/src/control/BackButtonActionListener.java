package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import view.Othello;

public class BackButtonActionListener implements ActionListener {
	
	Othello othello;
	
	private JButton[][] buttonBoard;
	
	private ImageIcon[] icon;
	
	private boolean isBack;
	
	private int[][] backPlayer = Othello.getBackPlayer();
	private int[][] board = Othello.getBoard();
	private int player;
	
	public BackButtonActionListener(){}
	public BackButtonActionListener(Othello othello) {
		this.othello = othello;
		buttonBoard = othello.button_board;
		icon = othello.icon;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		isBack = false;
		player = Othello.getPlayer();
		
		for(int i=0; i < 64; i++) {
			if(backPlayer[i/8][i%8] != 0) {
				isBack = true;
				break;
			}
		}
		
		if(isBack) {
			for(int i=0; i < 64; i++) {
				buttonBoard[i/8][i%8].setIcon(icon[3]);
				if(backPlayer[i/8][i%8] == 2) {
					board[i/8][i%8] = 0;
				}
				else {
					board[i/8][i%8] = backPlayer[i/8][i%8];
				}
				
				if(backPlayer[i/8][i%8] == 1) {
					buttonBoard[i/8][i%8].setIcon(icon[1]);
				}
				
				if(backPlayer[i/8][i%8] == -1) {
					buttonBoard[i/8][i%8].setIcon(icon[0]);
				}
				backPlayer[i/8][i%8]=0;
			}
			player = -player;
			Othello.setPlayer(player);
			
			othello.game.find();
		}
	}
}


