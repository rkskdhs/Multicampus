package io.readerwriter;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReaderWriterTest
{
	public static void main( String args[])
	{
		UIForm3 ui = new UIForm3();
		ui.addLayout();
		ui.eventProc();	
	}	
}

//========================================
//	화면을 관리하는 클래스 
//----------------------------------------
class UIForm3 extends JFrame
{
	JTextArea	ta;
	JButton 		bSave, bLoad, bClear;

	UIForm3()
	{
		ta		= new JTextArea();		
		bSave 	= new JButton("파일저장");
		bLoad	= new JButton("파일읽기");
		bClear	= new JButton("화면지우기");
	}

	void addLayout()
	{
		JPanel pCenter 	= new JPanel();
		pCenter.setLayout( new BorderLayout() );
		pCenter.add("Center", new JScrollPane(ta) );

		JPanel pSouth	= new JPanel();
		pSouth.add( bSave );
		pSouth.add( bLoad );
		pSouth.add( bClear );

		getContentPane().add("Center", pCenter );
		getContentPane().add("South",  pSouth );

		setSize( 400, 350 );
		setVisible( true );

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

	void eventProc()
	{
		EventHandler hdlr = new EventHandler();

		bSave.addActionListener(hdlr);
		bLoad.addActionListener(hdlr);

	}

	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			Object evt = ev.getSource();

			// "화일저장" 버튼이 눌렸을 때 
			if( evt == bSave){

				JFileChooser fc = new JFileChooser();
				//	fc.showOpenDialog(null);
				int re = fc.showSaveDialog(null);
				if(re == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					try {
						FileWriter out = new FileWriter(f);
						out.write(ta.getText());
						out.close();

					}catch(Exception ex){
						System.out.println("저장실패"+ ex.getMessage());
					}

				}

			}

			if(evt==bLoad) {

				JFileChooser fc = new JFileChooser();
				int re = fc.showSaveDialog(null);
				if(re == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();


					try {
						FileReader in = new FileReader(f);
						int data = 0;
						StringBuffer sb = new StringBuffer();
						while ((data = in.read() )!=-1) {
							sb.append((char)data);
						}
						ta.setText(sb.toString());
						in.close();

					}catch(Exception ex) {
						System.out.println("불러오기 실패" + ex.getMessage());
					}
				}
			}
		}
	}
}