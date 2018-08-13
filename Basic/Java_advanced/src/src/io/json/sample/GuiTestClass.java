package io.json.sample;

import java.awt.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

class MyFrame extends JFrame
{
	// 변수선언
	JTextField tfName, tfTel, tfJumin, tfGender, tfAge, tfHome;
	JButton bSave, bOpen;
	
	// 객체 생성
	public MyFrame(){		
		super("나의 첫 화면");
		tfName = new JTextField(15);
		tfTel = new JTextField(15);
		tfJumin = new JTextField(15);
		tfGender = new JTextField(15);
		tfAge = new JTextField(15);
		tfHome = new JTextField(15);
		
		bSave = new JButton("저장하기");
		bOpen = new JButton("읽어오기");
		
	}
	
	// 화면구성 및 보여주기
	public void addLayout(){
		
		JPanel p_center = new JPanel();
		p_center.setLayout( new GridLayout( 6, 2 ));
		p_center.add( new JLabel("이름"));
		p_center.add( tfName );
		p_center.add( new JLabel("전화"));
		p_center.add( tfTel );
		p_center.add( new JLabel("주민"));
		p_center.add( tfJumin );
		p_center.add( new JLabel("성별"));
		p_center.add( tfGender );
		p_center.add( new JLabel("나이"));
		p_center.add( tfAge );
		p_center.add( new JLabel("이름"));
		p_center.add( tfHome );
		
		JPanel p_south = new JPanel();
		p_south.add( bSave );
		p_south.add( bOpen );
		
		add( p_center, BorderLayout.CENTER);
		add( p_south, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		
	}
	
	// 이벤트 연결
	public void eventProc()
	{
		/* 이벤트 핸들러 객체 생성*/
		BtnHandler bHandler = new BtnHandler();
		
		/* 컴포넌트와 이벤트핸들러 연결 */
		bSave.addActionListener(bHandler);
		bOpen.addActionListener(bHandler);
		
	
	}
	
	/* 이벤트 핸들러 선언 */
	class BtnHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent ev)
		{
			Object btn = ev.getSource();
			//JButton btn = (JButton)ev.getSource();
			if( btn == bSave ) {
				//JOptionPane.showMessageDialog(null, "저장합니다.");
				saveData();
			}else if ( btn ==  bOpen) {
				//JOptionPane.showMessageDialog(null, "입력합니다.");
			readData();
			}
			
		}
	} // end of class BtnHandler
	
	void saveData() {
			JSONObject obj = new JSONObject();
			obj.put("name", tfName.getText());
			obj.put("tel",tfTel.getText() );
			obj.put("jumin", tfJumin.getText());
			obj.put("gender", tfGender.getText());
			obj.put("age", tfAge.getText());
			obj.put("home", tfHome.getText());
			System.out.println(obj);
			
			try {
				FileWriter out = new FileWriter("test.json");
				out.write(obj.toJSONString());
				out.close();
				
			}catch(Exception ex){
				System.out.println("저장 실패"+ex.getMessage());
				
			}
			
	}

	void readData() {
		try {
			FileReader in = new FileReader("test.json");
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject)parser.parse(in);
			tfName.setText((String)obj.get("name"));
			tfTel.setText((String)obj.get("tel"));
			tfJumin.setText((String)obj.get("jumin"));
			tfGender.setText((String)obj.get("gender"));
			tfAge.setText((String)obj.get("age"));
			tfHome.setText((String)obj.get("home"));
					}catch(Exception ex) {
			System.out.println("읽기 실패" + ex.getMessage());
		}
		
	}
	
} // end of class MyFrame

public class GuiTestClass {
	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.addLayout();
		my.eventProc();
	}
}
