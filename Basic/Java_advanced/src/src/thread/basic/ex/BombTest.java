package thread.basic.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BombTest extends JFrame{
	private JPanel p1,p2;
	private JButton btn;
	private JLabel lb, image;
	private boolean inputChk;

	BombTest(){
		setTitle("폭탄 테스트!");
		p1 = new JPanel();
		p1.add(btn = new JButton("시작")); 
		p1.add(lb = new JLabel("카운트다운")); 
		add(p1,"North");
		p2 = new JPanel();
		p2.add(image = new JLabel(new ImageIcon("src\\thread\\basic\\ex\\bomb_1.jpg")));

		add(p2, "Center");
		setBounds(200, 200, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 1- 카운트 다운을 시작하는 스레드 
				new Thread(new Runnable() {
					public void run() {
						for (int i = 3; i>0; i--) {
							if(inputChk) {
								lb.setText("살았다");
								inputChk = false;
								return;
							}
							lb.setText(String.valueOf(i));
						try{
								Thread.sleep(500);
							}catch(Exception ex){
								
							}System.out.println(i);
						}
						
						if(!inputChk) {
							System.out.println("BBB");
							JPanel pp = new JPanel();
							pp.add(new JLabel(new ImageIcon("src\\thread\\basic\\ex\\bomb_2.jpg")));
							add(pp, "Center");
							repaint();
						}
					}
				}).start();

				

				// 2- 입력값을 받는 쓰레드
				new Thread(new Runnable() {
					public void run() {
						String input = JOptionPane.showInputDialog(p2);
						inputChk = true;
						
					}

				}).start();

			}
		});
	}

	public static void main(String[] args) {
		new BombTest();
	}
}
