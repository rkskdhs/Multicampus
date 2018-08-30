package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import control.BackButtonActionListener;
import control.GameButtonActionListener;
import control.MenuActionListener;

@SuppressWarnings("serial")
public class Othello extends JFrame {
	
	public Game game;
	
	private Container pane = getContentPane();
	
	private JDialog win = new JDialog(this, "Winner", true);
	
	private JMenu menu = new JMenu();
	
	private JMenuBar mb = new JMenuBar();
	
	private JPanel center_panel = new JPanel();
	private JPanel bottom_panel = new JPanel();
	private JPanel back_panel = new JPanel();
	
	public ImageIcon[] icon = {
	         new ImageIcon("3030/white.png"),
	         new ImageIcon("3030/black.png"),
	         new ImageIcon("3030/circle30.png"),
	         new ImageIcon("3030/none.png"),
	         };
	private ImageIcon background = new ImageIcon("3030/circle30.png");
	
	public JLabel count_black = new JLabel();
	public JLabel count_white = new JLabel();
	private JLabel black_win = new JLabel();
	private JLabel white_win = new JLabel();
	private JLabel draw = new JLabel();
	private JLabel back_lb = new JLabel(background);
	
	public JButton[][] button_board = new JButton[8][8];
	private JButton button_back = new JButton("Back");
	
	private String menu_String = "File";
	public String filemenu_String[] = { "New", "Save", "Load", "EXIT" };
	
	private static int[][] board = new int[8][8];
	private static int[][] back_player = new int[8][8];
	private static int[] count = new int[]{ 2, 2 };
	private static int player;
	
	public static int[][] getBoard(){
		return board;
	}
	
	public static int[][] getBackPlayer(){
		return back_player;
	}
	
	public static int[] getCount(){
		return count;
	}
	
	public static int getPlayer(){
		return player;
	}
	
	public static void setPlayer(int p){
		player = p;
	}
	
	private void init() {
		game = new Game(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setTitle("Othello Game");
		setResizable(false);
		setVisible(true);
		
		pane.setLayout(new BorderLayout());
		pane.add(back_panel);
		
		back_panel.setLayout(new BorderLayout());
		back_panel.add(back_lb);
		back_panel.add(bottom_panel, BorderLayout.SOUTH);
		back_panel.add(center_panel, BorderLayout.CENTER);
		
		center_panel.setLayout(new GridLayout(8,8));
		
		bottom_panel.setLayout(new FlowLayout());
		bottom_panel.setBackground(Color.LIGHT_GRAY);
		bottom_panel.add(count_black);
		bottom_panel.add(button_back);
		bottom_panel.add(count_white);
		
		button_back.addActionListener(new BackButtonActionListener(this));
	}
	
	private void jmenu_add() {
		JMenuItem[] JFMItem = new JMenuItem[filemenu_String.length];
		
		menu = new JMenu(menu_String);
		mb.add(menu);
		
		for(int i = 0;i < JFMItem.length; i++) {
			JFMItem[i] = new JMenuItem(filemenu_String[i]);
			menu.add(JFMItem[i]);
			JFMItem[i].addActionListener(new MenuActionListener(this));
		}
		
		this.setJMenuBar(mb);
	}
	
	public void mapInit()	{
		for(int i=0;i<64;i++) {
			board[i/8][i%8] = 0;
			button_board[i/8][i%8] = new JButton();
			if((i + i/8) % 2 == 0) {
				button_board[i/8][i%8].setBackground(Color.gray);
			}
			else {
				button_board[i/8][i%8].setBackground(Color.white);
			}
			button_board[i/8][i%8].setBorderPainted(false);
			
			button_board[i/8][i%8].addActionListener(new GameButtonActionListener(this));
			center_panel.add(button_board[i/8][i%8]);
		}
	}
	
	public void gameInit() {
		count[0] = 2;
		count[1] = 2;
		
		count_black.setText("Black : " + String.valueOf(count[1]));
		count_white.setText("White : " + String.valueOf(count[0]));
		count_black.setEnabled(true);
		count_white.setEnabled(false);
		
		for(int i=0;i<64;i++) {
			board[i/8][i%8] = 0;
			button_board[i/8][i%8].setIcon(icon[3]);
			back_player[i/8][i%8] = 0;
		}
		
		player = 1;
		board[3][3] = 1;
		board[3][4] = -1;
		board[4][3] = -1;
		board[4][4] = 1;
		button_board[3][3].setIcon(icon[1]);
		button_board[3][4].setIcon(icon[0]);
		button_board[4][3].setIcon(icon[0]);
		button_board[4][4].setIcon(icon[1]);
		
		game.find();
	}
	
	public void loadInit() {
		count[0] = 2;
		count[1] = 2;
		
		count_black.setText("Black : " + String.valueOf(count[1]));
		count_white.setText("White : " + String.valueOf(count[0]));
		count_black.setEnabled(true);
		count_white.setEnabled(false);
		
		for(int i=0;i<64;i++) {
			board[i/8][i%8] = 0;
			button_board[i/8][i%8].setIcon(icon[3]);
			back_player[i/8][i%8] = 0;
		}
		
		
		game.find();
	}
	
	public void resultDialogInit() {
		win.setLocation(this.getX() + 150, this.getY() + 180);
		win.setSize(200, 100);
		win.setLayout(new FlowLayout());
		
		win.add(black_win);
		win.add(white_win);
		win.add(draw);
	}
	
	public void showResult() {
		if(count[1] > count[0]) {
			black_win.setText("Black WIN!");
		}
		else if (count[1] < count[0]) {
			white_win.setText("White WIN!");
		}
		else {
			draw.setText("DRAW!");
		}
		
		win.setVisible(true);
	}
	
	public Othello() {
		init();
		jmenu_add();
		mapInit();
		gameInit();
		resultDialogInit();
	}
}
