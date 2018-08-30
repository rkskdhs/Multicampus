package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import view.Othello;

public class GameButtonActionListener implements ActionListener {

	Othello othello;
	
	private JButton[][] buttonBoard;
	
	private ImageIcon[] icon;
	
	private boolean isEnd, isChange, turn = false;
	
	private int[][] gameBoard = Othello.getBoard();
	private int[][] backPlayer = Othello.getBackPlayer();
	private int player;
	
	public GameButtonActionListener(){}
	public GameButtonActionListener(Othello othello) {
		this.othello = othello;
		buttonBoard = othello.button_board;
		icon = othello.icon;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		isEnd = false;
		player = Othello.getPlayer();
		
		for(int i=0;i<64;i++) {
			if(buttonBoard[i/8][i%8] == e.getSource() && gameBoard[i/8][i%8] == 2)	{
				for(int j=0;j<64;j++) {
					backPlayer[j/8][j%8] = gameBoard[j/8][j%8];
				}
				break;
			}
		}
		
		for(int i=0;i<64;i++) {
			if(buttonBoard[i/8][i%8] == e.getSource() && gameBoard[i/8][i%8] == 2)	{
				//상하좌우
				isChange = false;
				for(int j=i % 8; j>=0;j--) {
					if(gameBoard[i/8][j] == -player) {
						if(j-1 >=0 && gameBoard[i/8][j-1] == player) {
							isChange=true;
							break;
						}
					}
				}
				
				if(i%8 - 1 >= 0 && gameBoard[i/8][i%8 - 1] != -player) {
					isChange = false;
				}
			
				if(isChange) {
					for(int j=i % 8; j>=0;j--) {
						if(gameBoard[i/8][j] == 0) {
							break;
						}
						if(gameBoard[i/8][j] == player) {
							isEnd = true; break;
						}
						if(gameBoard[i/8][j] == -player) {
							gameBoard[i/8][j] = player; 
							buttonBoard[i/8][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				
				isChange = false;
				for(int j=i % 8; j<8;j++) {
					if(gameBoard[i/8][j] == -player) {
						if(j+1 <8 && gameBoard[i/8][j+1] == player) {
							isChange=true;
							break;
						}
					}
				}
				if(i%8+1 < 8 && gameBoard[i/8][i%8 + 1] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i%8; j<8;j++) {
						if(gameBoard[i/8][j] == 0) {
							break;
						}
						if(gameBoard[i/8][j] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[i/8][j] == -player) {
							gameBoard[i/8][j] = player; 
							buttonBoard[i/8][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				
				isChange = false;
				for(int j=i / 8; j>=0;j--) {
					if(gameBoard[j][i%8] == -player) {
						if(j-1 >=0 && gameBoard[j-1][i%8] == player) {
							isChange=true; 
							break;
						}
					}
				}
				if(i/8 - 1 >= 0 && gameBoard[i/8-1][i%8] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i / 8; j>=0;j--) {
						if(gameBoard[j][i%8] == 0) {
							break;
						}
						if(gameBoard[j][i%8] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[j][i%8] == -player) {
							gameBoard[j][i%8] = player; 
							buttonBoard[j][i%8].setIcon(icon[(player+1)/2]);
						}
					}
				}
				
				isChange = false;
				for(int j=i / 8; j<8;j++) {
					if(gameBoard[j][i%8] == -player) {
						if(j+1 <8 && gameBoard[j+1][i%8] == player) {
							isChange=true; 
							break;
						}
					}
				}
				if(i/8+1 < 8 && gameBoard[i/8+1][i%8] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i / 8; j<8;j++) {
						if(gameBoard[j][i%8] == 0) {
							break;
						}
						if(gameBoard[j][i%8] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[j][i%8] == -player) {
							gameBoard[j][i%8] = player; 
							buttonBoard[j][i%8].setIcon(icon[(player+1)/2]);
						}
					}
				}
				//대각선 
				isChange = false;
				for(int j=i % 8,a = i/8; j>=0 && a>=0; j--, a--) {
					if(gameBoard[a][j] == -player) {
						if(a-1 >= 0 && j-1 >=0 && gameBoard[a-1][j-1] == player) {
							isChange=true;
							break;
						}
					}
				}
				if(i/8-1 >= 0 && i%8 - 1 >=0 && gameBoard[i/8-1][i%8 - 1] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i % 8,a = i/8; j>=0 && a>=0; j--, a--) {
						if(gameBoard[a][j] == 0) {
							break;
						}
						if(gameBoard[a][j] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[a][j] == -player) {
							gameBoard[a][j] = player; 
							buttonBoard[a][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				
				isChange = false;
				for(int j=i % 8,a = i/8; j<8 && a>=0; j++, a--)	{
					if(gameBoard[a][j] == -player) {
						if(a-1 >= 0 && j+1 <8 && gameBoard[a-1][j+1] == player) {
							isChange=true; 
							break;
						}
					}
				}
				if(i/8-1 >= 0 && i%8 + 1 < 8 && gameBoard[i/8-1][i%8 + 1] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i % 8,a = i/8; j<8 && a>=0; j++, a--) {
						if(gameBoard[a][j] == 0) {
							break;
						}
						if(gameBoard[a][j] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[a][j] == -player) {
							gameBoard[a][j] = player; 
							buttonBoard[a][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				isChange = false;
				for(int j=i % 8,a = i/8; j>=0 && a<8; j--, a++)	{
					if(gameBoard[a][j] == -player) {
						if(a+1 < 8 && j-1 >= 0 && gameBoard[a+1][j-1] == player) {
							isChange=true;
							break;
						}
					}
				}
				if(i/8 + 1 < 8 && i%8 - 1 >= 0 && gameBoard[i/8 + 1][i%8 - 1] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i % 8,a = i/8; j>=0 && a<8; j--, a++)	{
						if(gameBoard[a][j] == 0) {
							break;
						}
						if(gameBoard[a][j] == player) {
							isEnd = true;
							break;
						}
						if(gameBoard[a][j] == -player) {
							gameBoard[a][j] = player; 
							buttonBoard[a][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				isChange = false;
				for(int j=i % 8,a = i/8; j<8 && a<8; j++, a++) {
					if(gameBoard[a][j] == -player) {
						if(a+1<8 && j+1<8 && gameBoard[a+1][j+1] == player) {
							isChange=true;
							break;
						}
					}
				}
				if(i/8+1 < 8 && i%8 + 1 < 8 && gameBoard[i/8+1][i%8 + 1] != -player) {
					isChange = false;
				}
				if(isChange) {
					for(int j=i % 8,a = i/8; j<8 && a<8; j++, a++) {
						if(gameBoard[a][j] == 0) {
							break;
						}
						if(gameBoard[a][j] == player) {
							isEnd = true; 
							break;
						}
						if(gameBoard[a][j] == -player) {
							gameBoard[a][j] = player; 
							buttonBoard[a][j].setIcon(icon[(player+1)/2]);
						}
					}
				}
				
				gameBoard[i/8][i%8] = player;
				buttonBoard[i/8][i%8].setIcon(icon[(player+1)/2]);
				
				turn = !turn;
				player = -player;
				Othello.setPlayer(player);
				othello.game.find();
			}
			if(isEnd) { 
				break; 
			}
		}

	}

}
