package Calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class calcul {

	JFrame f;
	JButton a, b, c, d, e, g, h, i, j, k, l, m, n, o, bdivide ;
	TextArea ta;
	
	
	JButton []btn = new JButton [10];
	
	int first;
	char op;
	
	calcul(){
		
	f = new JFrame("초등 계산");
	k = new JButton("+");
	m = new JButton("=");
	n = new JButton("-");
	o = new JButton("*");
	bdivide = new JButton("/");
	ta = new TextArea(5,40);
	
	for (int i = 0; i < btn.length; i++) {
		btn[i]= new JButton(String.valueOf(i));
	}
	
	
	}
	
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,3));

		for (int i = 1; i < btn.length; i++) {
			p.add(btn[i]);
		}
		p.add(k);    p.add(btn[0]);     p.add(m);
		p.add(n); 
		p.add(o); 
		p.add(bdivide);
		
		
		f.add(ta,BorderLayout.NORTH);
		f.add(p,BorderLayout.CENTER );
		
		f.setSize(500, 500);
		f.setVisible(true);
		
		}
	
	
	void eventProc() {
		EvtHdlr bh = new EvtHdlr();
		
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(bh);	
		}		
		k.addActionListener(bh);
		m.addActionListener(bh);
		n.addActionListener(bh);
		o.addActionListener(bh);
		bdivide.addActionListener(bh);
		
		
		
	}
	
	class EvtHdlr implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton evt = (JButton)e.getSource();
			
			// 숫자버튼이 눌린경우
			for (int i = 0; i < btn.length; i++) {
				if( evt == btn[i]) {
					String temp = ta.getText();
					temp += evt.getText();
					ta.setText(   temp  );
				}
			}
			
			// 연산자버튼이 눌린경우
			if( evt == k | evt== n | evt==o | evt== bdivide) {
				// ta의 숫자를 fisrt 변수 저장 ( Integer.parseInt() )
				// 연산자 글자를 op 변수 저장 ( charAt(0) )
				first =Integer.parseInt(ta.getText());//화면에 있는 값을 가져오는 것이지, 다시 집어넣어 가져오는 것이 아니다
				
				op = evt.getText().charAt(0);//타입을 정해주면 멤버변수가 아니라 지역변수가 되어 다른 데서는 사용할 수가 없음
				
				ta.setText("");
				
			}
			
			// = 버튼이 눌린경우
			if( evt == m) { 
				
				// ta의 숫자를 얻어오고
				// first
				// op 연산
				// 그 결과를 ta 출력
				int second =Integer.parseInt(ta.getText());
				int result = 0;
				switch(op) {
				case '+' : result =  first + second; break;
				case '-' : result = first - second ; break;
				case '*' : result = first * second; break;
				case '/' : result = first / second; break; 
				}
				ta.setText(String.valueOf(result ));
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		calcul cal = new calcul();
		cal.addLayout();
		cal.eventProc();
	}

}
