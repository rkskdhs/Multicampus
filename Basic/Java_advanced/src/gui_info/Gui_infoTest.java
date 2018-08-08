package gui_info;
import java.awt.*;

public class Gui_infoTest {

		//1.맴버 변수 선언
		Frame f;
		Button insert, modify, delete, view, exit;
		TextArea ta;
		
		TextField tfTel;
		TextField tfname;
		TextField tfjumin;
		TextField tfgender;
		TextField tfage;
		TextField tfhome;
		Label Tel, name, jumin, gender, age, home;
		
		
		
		
		
		
		
		//2.객체 생성
		Gui_infoTest(){
			f = new Frame("화면");
		
			ta = new TextArea(5,30);
			
			 modify = new Button("수정");
			 delete = new Button("삭제");
			 view = new Button("전체보기");
			 exit = new Button("나가기");
			 insert = new Button("삽입");
			 
			 Tel = new Label("전화번호");
			 name = new Label("이름");
			 jumin = new Label("주민번호");
			 gender = new Label("성별");
			 age = new Label("나이");
			 home = new Label("출생지");
			
			 tfTel = new TextField();
			 tfname = new TextField();
			 tfjumin = new TextField();
			 tfgender = new TextField();
			 tfage = new TextField();
			 tfhome = new TextField();
			
			
		}
		//3. 화면 붙이기 및 출력
		void addLayout() {
			f.setLayout(new BorderLayout());
			
			Panel p1 = new Panel();
			p1.setLayout(new GridLayout(6,2));
			p1.add(Tel);			p1.add(tfTel);
			p1.add(name);     p1.add(tfname);
			p1.add(jumin);		p1.add(tfjumin);
			p1.add(gender);	p1.add(tfgender);
			p1.add(age);		p1.add(tfage);
			p1.add(home);		p1.add(tfhome);
			f.add(p1,BorderLayout.WEST);
			
			Panel p2 = new Panel();
			p2.setLayout(new GridLayout(1,5));
			p2.add(modify);
			p2.add(delete);
			p2.add(view);
			p2.add(exit);
			p2.add(insert);
			f.add(p2,BorderLayout.SOUTH);
			
			f.setSize(700,600);
			f.setVisible(true);
			
			
			
			
		}
	
	public static void main(String[] args) {
		Gui_infoTest it = new Gui_infoTest();
		it.addLayout();
	}
	
}
