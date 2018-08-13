package gui_info;

import java.awt.*;

import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;



public class InfoTest {





	// 1. 멤버 변수 선언

	JFrame f;



	JTextField tfTel;

	JTextField tfName;

	JTextField tfJumin;

	JTextField tfGender;

	JTextField tfAge;

	JTextField tfHome;

	JTextArea ta;

	JButton bInsert;

	JButton bModify;

	JButton bDelete;

	JButton bShow;

	JButton bExit;



	// 2. 객체생성

	InfoTest() {

		f = new JFrame();

		tfTel = new JTextField(10);

		tfName = new JTextField(10);

		tfJumin = new JTextField(10);

		tfGender = new JTextField(10);

		tfAge = new JTextField(10);

		tfHome = new JTextField(10);

		ta = new JTextArea();

		bInsert = new JButton("입력",new ImageIcon("src\\gui\\Info\\copy\\img\\cat.PNG"));

		bModify = new JButton("수정");

		bDelete = new JButton("삭제");

		bShow = new JButton("전체보기");

		bExit = new JButton("나가기");

	}

	// 3. 화면 붙이기 및 출력

	void addLayout() {

		f.setLayout(new BorderLayout());

		f.add(ta, BorderLayout.CENTER);

		JPanel p1 = new JPanel();

		p1.setLayout(new GridLayout(6,2));

		p1.add(new JLabel("전화번호"));

		p1.add(tfTel);

		p1.add(new JLabel("이름"));

		p1.add(tfName);

		p1.add(new JLabel("주민번호"));

		p1.add(tfJumin);

		p1.add(new JLabel("성별"));

		p1.add(tfGender);

		p1.add(new JLabel("나이"));

		p1.add(tfAge);

		p1.add(new JLabel("출신지"));

		p1.add(tfHome);

		f.add(p1, BorderLayout.WEST);

		JPanel p2 = new JPanel();

		p2.setLayout(new GridLayout(1,5));

		p2.add(bInsert);

		p2.add(bModify);

		p2.add(bDelete);

		p2.add(bShow);

		p2.add(bExit);

		f.add(p2,BorderLayout.SOUTH);





		f.setSize(700,600);

		f.setVisible(true);

		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	}



	void initStyle() {

		bInsert.setRolloverIcon(new ImageIcon("src\\gui\\Info\\copy\\img\\cat2.PNG"));

		bInsert.setPressedIcon(new ImageIcon("src\\gui\\Info\\copy\\img\\cat3.PNG"));

		bInsert.setToolTipText("정보를 입력하세요");

		bInsert.setMnemonic('i');

	}



	//이벤트 등록

	void eventProc() {

		//(2)이벤트 핸들러 객체 생성

		BtnHdlr bh = new BtnHdlr();

		//(3) 이벤트발생 컴포넌트를 등록(연결)

		bInsert.addActionListener(bh);

		bModify.addActionListener(bh);

		bDelete.addActionListener(bh);

		bShow.addActionListener(bh);

		bExit.addActionListener(bh);

		//포커스 이벤트 핸들러 객체 생성
		JuminHdlr jh = new JuminHdlr();
		//주민 텍스트필드 포커스 이벤트 
		tfJumin.addFocusListener(jh);
		
		WinHdlr wh = new WinHdlr();
		f.addWindowListener(wh);
		
		//end of eventProc


	}
	
	class WinHdlr extends WindowAdapter{
		
		
		public void windowClosing(WindowEvent e) {
			int option  = JOptionPane.showConfirmDialog(null, "돌아가기");
			if(option == JOptionPane.OK_OPTION) {
				System.exit(0);
			}else {
				f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
			
			
			
		}
		
	}


	class JuminHdlr implements FocusListener{
		public void focusGained(FocusEvent e) {

		}

		public void focusLost(FocusEvent e) {
			String id = tfJumin.getText();
			char sung = id.charAt(7);
			String gender = "";
			if(sung=='1') gender="남자";
			else gender = "여자";

			tfGender.setText(gender);
			
			
			
			
			
			
			
			String yeondo = id.substring(0,2);
			int nai = Integer.parseInt(yeondo);
			
			Calendar cal= Calendar.getInstance();
			System.out.println(cal.get(Calendar.YEAR));
			int aaa = cal.get(Calendar.YEAR);
			

			int age = 0;//만약에 if에 해당하는 것이 없을경우를 위해 초기화해야됨
			
			if(sung=='1'||sung=='2') {
				age = aaa - (1900 + nai) +1;
			}
			
			else if(sung =='3'|| sung=='4') {
				age = aaa - (2000 + nai) +1;
			}
			
			tfAge.setText(String.valueOf(age));
			
			
			char home  = id.charAt(8);
			String from = "";
			if(home == '1') from = "서울";
			else from = "타지";
			
			tfHome.setText(from);
			
			


		}
	}

	//(1)이벤트 핸들러

	class BtnHdlr implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			JButton btn = (JButton)e.getSource();

			if(btn==bInsert) {

				JOptionPane.showMessageDialog(null, "입력합니다.");

			}else if (btn ==bModify) {

				JOptionPane.showMessageDialog(null, "수정합니다.");

			}else if (btn ==bDelete) {

				JOptionPane.showMessageDialog(null, "삭제합니다.");

			}else if (btn ==bShow) {

				JOptionPane.showMessageDialog(null, "전체보기.");

			}else if(btn ==bExit) {

				System.exit(0);

			}

		}

	}



	public static void main(String[] args) {

		InfoTest it = new InfoTest();

		it.addLayout();

		it.initStyle();

		it.eventProc();

	}

}


