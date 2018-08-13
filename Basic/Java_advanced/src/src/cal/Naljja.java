package cal;
import java.awt.*;

import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;




public class Naljja{
	//멤버 변수 선언
	//객체 생성

	JFrame f;
	JComboBox cby, cbm, cbd;
	JButton btn;
	JLabel la;

	int [] lastDays = { 31,28,31,30,31,30,31,31,30,31,30,31};

	Naljja(){

		Integer [] yeon = new Integer[11];
		Calendar c = Calendar.getInstance();
		int thisyear = c.get(Calendar.YEAR);
		for(int k = 0 , y = thisyear - 5;k<yeon.length; k++, y++) {
			yeon[k]= y;
		}

		Integer [] dal = new Integer [12];
		for (Integer i = 0; i<dal.length; i++) {
			dal[i] = i+1;
		}

		Integer [] il = new Integer [31];
		for(Integer j = 0; j < il.length; j++) {
			il[j] = j+1;
		}


		f = new JFrame("날짜");
		cby = new JComboBox(yeon);
		cbm = new JComboBox(dal);
		cbd = new JComboBox();
		btn = new JButton("@");
		la = new JLabel();
	}


	void addLayout() {
		//화면 붙이기 및 출력

		f.setLayout(new FlowLayout());
		f.add(cby); f.add(new JLabel("년"));
		f.add(cbm);f.add(new JLabel("월"));
		f.add(cbd);f.add(new JLabel("일"));
		f.add(btn); f.add(la);
		f.setVisible(true);
		f.setSize(500,500);
		//f.setDefaultCloseOperation(JFame.EXIT_ON);
		//오늘 날짜 얻어서 날짜 지정

		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int  m= c.get(Calendar.MONTH)+1;
		int  d= c.get(Calendar.DATE);

		cby.setSelectedItem(y);
		cbm.setSelectedItem(m);
		getDay();
		cbd.setSelectedItem(d);
		getDate();

	}
	void evetproc() {
		EvtHdlr eh = new EvtHdlr();
		cby.addActionListener(eh);
		cbm.addActionListener(eh);
		btn.addActionListener(eh);
	}
	//이벤트 등록
	class EvtHdlr implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Object evt = e.getSource();
			if(evt == cby || evt == cbm) {
				getDay();
			}else if (evt==btn) {
				getDate();
			} // end of if 
		} // end of actionPerformed

	} // end of EvtHdlr

	void getDate() {

		int y = (Integer)cby.getSelectedItem();//값을 가져오는 것
		int m = (Integer)cbm.getSelectedItem();
		int d = (Integer)cbd.getSelectedItem();

		Calendar c = Calendar.getInstance();
		c.set(y,m-1,d);
		int date = c.get(Calendar.DAY_OF_WEEK);
		String []  strDate = {"일", "월", "화","수","목","금","토"};

		la.setText(strDate[date-1]);
	}

	void getDay(){
		int y = (Integer)cby.getSelectedItem();
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			lastDays[1]=29;
		}else {
			lastDays[1]=28;
		}

		int m =cbm.getSelectedIndex();
		cbd.removeAllItems();
		for(int i =1; i<=lastDays[m]; i++) {
			cbd.addItem(i);
		}
	}




	public static void main(String[] args) {

		Naljja jja = new Naljja();
		jja.addLayout();
		jja.evetproc();
	}


}