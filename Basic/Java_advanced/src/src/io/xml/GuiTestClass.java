package io.xml;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.RandomAccessFile;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;
import org.w3c.dom.Node;

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
			}else if ( btn ==  bOpen) {
				//JOptionPane.showMessageDialog(null, "입력합니다.");
			}
		}
	} // end of class BtnHandler
	
	void saveData(){
		File f = new File("io.xml");
		try {
		RandomAccessFile raf = new RandomAccessFile(f,"rw");//입출력을 같이 하는 통로
		
		String tag = makeTags();
		raf.write(tag.getBytes());
		raf.close();
		}catch(Exception ex) {
			System.out.println("저장실패" + ex);
		}
	}

	String makeTags(){
		StringBuilder sb = new StringBuilder();
		sb.append("<person>");
		sb.append("<name>"+tfName.getText() +"</name>");
		
		sb.append("</preson>");
		return sb.toString();
	}
	
	void readData() {
		try {
		DocumentBuilderFactory docBuildfac = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuild = docBuildfac.newDocumentBuilder();
		Document doc = docBuild.parse(new File("io.xml"));
	
		
		
		NodeList personlist = doc.getElementsByTagName("person");
		for( int i = 0; i<personlist.getLength();i++) {
			Node tempNode = personlist.item(i);
			NodeList childlist = tempNode.getChildNodes();
			for(int j =0; j<childlist.getLength();j++) {
				Node temp = childlist.item(j);
				if(temp.getNodeName().equals("name")) {
					tfName.setText(temp.getTextContent());
				}
			}
		}
		}catch(Exception ex) {
		System.out.println("읽기 실패"+ ex.getMessage());
		
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
