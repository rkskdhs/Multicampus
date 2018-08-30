package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Game {
	
	Othello othello;
	
	private JButton[][] buttonBoard;
	
	private JLabel countBlack;
	private JLabel countWhite;
	
	private ImageIcon[] icon;
	
	private int[][] gameBoard = Othello.getBoard();
	private int[] findCount = new int[]{ 0, 0, };
	private int[] count = Othello.getCount();
	private int player;
	
	public Game() {}
	public Game(Othello othello){
		this.othello = othello;
		buttonBoard = othello.button_board;
		countBlack = othello.count_black;
		countWhite = othello.count_white;
		icon = othello.icon;
	}
	
	public void find() {
		player = Othello.getPlayer();
		findCount[(player + 1) / 2] = 0;
		
		if(player == 1) {
			countBlack.setEnabled(true);
			countWhite.setEnabled(false);
		}
		else {
			countBlack.setEnabled(false);
			countWhite.setEnabled(true);
		}
		
		count[0] = count[1] = 0;
		
		for(int j=0;j<64;j++) {
			if(gameBoard[j/8][j%8] == 2) {
				gameBoard[j/8][j%8] = 0;
				buttonBoard[j/8][j%8].setIcon(icon[3]);
			}
			
			if(gameBoard[j/8][j%8] == 1) {
				count[1]++;
			}
			
			if(gameBoard[j/8][j%8] == -1) {
				count[0]++;
			}	
		}
		
		countBlack.setText("Black : " + String.valueOf(count[1]));
		countWhite.setText("White : " + String.valueOf(count[0]));
		
		for(int i=0;i<64;i++) {
			if(gameBoard[i/8][i%8] == player) {
				//우좌하상
				for(int j=0; j<8 - i % 8;j++) {
					if(gameBoard[i/8][i%8 + j] == 0 && gameBoard[i/8][i%8 + j - 1] == -player) {
						gameBoard[i/8][i%8+j] = 2; 
						buttonBoard[i/8][i%8+j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8][i%8 + j] == 0) {
						break;
					}
				}
				
				for(int j=0; j<i % 8 + 1;j++) {
					if(gameBoard[i/8][i%8 - j] == 0 && gameBoard[i/8][i%8 - j + 1] == -player) {
						gameBoard[i/8][i%8-j] = 2; 
						buttonBoard[i/8][i%8-j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8][i%8 - j] == 0) {
						break;
					}
				}
				
				for(int j=0; j<8 - i / 8;j++) {
					if(gameBoard[i/8 + j][i%8] == 0 && gameBoard[i/8 + j - 1][i%8] == -player) {
						gameBoard[i/8 + j][i%8] = 2; 
						buttonBoard[i/8 + j][i%8].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8 + j][i%8] == 0){
						break;
					}
				}
				
				for(int j=0; j<i / 8 + 1;j++) {
					if(gameBoard[i/8 - j][i%8] == 0 && gameBoard[i/8 - j + 1][i%8] == -player) {
						gameBoard[i/8 - j][i%8] = 2; 
						buttonBoard[i/8 - j][i%8].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8 - j][i%8] == 0){
						break;
					}
				}
				
				//대각선
				for(int j=0; j<8 - i % 8;j++) {
					if(i/8 +j >= 8) {
						break;
					}
					if(gameBoard[i/8+j][i%8 + j] == 0 && gameBoard[i/8+j - 1][i%8 + j - 1] == -player) {
						gameBoard[i/8+j][i%8+j] = 2; 
						buttonBoard[i/8+j][i%8+j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8+j][i%8 + j] == 0){
						break;
					}
				}
				
				for(int j=0; j<i % 8+1;j++)	{
					if(i/8-j < 0) {
						break;
					}
					if(gameBoard[i/8-j][i%8 - j] == 0 && gameBoard[i/8-j + 1][i%8 - j + 1] == -player) {
						gameBoard[i/8-j][i%8-j] = 2; 
						buttonBoard[i/8-j][i%8-j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8-j][i%8 - j] == 0) {
						break;
					}
				}
				
				for(int j=0; j<8 - i % 8 &&  j<i / 8+1;j++)	{
					if(gameBoard[i/8-j][i%8 + j] == 0 && gameBoard[i/8-j + 1][i%8 + j - 1] == -player) {
						gameBoard[i/8-j][i%8+j] = 2; 
						buttonBoard[i/8-j][i%8+j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8-j][i%8 + j] == 0){
						break;
					}
				}
				
				for(int j=0; j<i % 8 +1 && j<8 - i / 8;j++)	{
					if(gameBoard[i/8+j][i%8 - j] == 0 && gameBoard[i/8+j - 1][i%8 - j + 1] == -player) {
						gameBoard[i/8+j][i%8-j] = 2; 
						buttonBoard[i/8+j][i%8-j].setIcon(icon[2]);
						findCount[(player + 1) / 2]++;
						break;
					}
					if(gameBoard[i/8+j][i%8 - j] == 0){
						break;
					}
				}
				
			}
		}
		
		if(findCount[(player + 1) / 2] == 0) {
			player = -player;
			Othello.setPlayer(player);
			if(findCount[(player + 1) / 2] != 0) {find();}
			else {
				othello.showResult();
			}
		}
		
	}
	
}
