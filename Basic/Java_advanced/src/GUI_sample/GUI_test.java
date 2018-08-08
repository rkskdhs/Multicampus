package GUI_sample;
import java.awt.*;

public class GUI_test {
	//1. 맴버 변수 선언
	Frame f;
	Button b;
	Checkbox cb1, cb2;
	TextField tf;
	TextArea ta;
	List li;
	
	//2.객체 생성
	GUI_test(){
		f = new Frame("나의 첫 화면");
		b = new Button ("확인");
		CheckboxGroup cbg = new CheckboxGroup();
		cb1 = new Checkbox("남자", cbg, true);
		cb2 = new Checkbox("여자", cbg, true); //둘다 true일 경우 마지막에 체크 한 것만 가능
		tf = new TextField(30);//알파벳 크기의 평균 값의 몇배
		ta = new TextArea(5,40);
		li = new List(5,false);
		
		
}
	
	
	
	//3.화면 붙이기 및 화면 출력
	void addLayout() {
		//컴포넌트 크기 고정하고 웟줄 상단 에 중앙 배치
		    //f.setLayout(new FlowLayout());
			//f.setLayout(new GridLayout(3,2));//행과 열에 맞추어 배치. 컴포넌트 크기가 변화함
		 	f.setLayout(new BorderLayout());//위 아래 중앙 양옆에 배치
		 	f.add(b,BorderLayout.NORTH);
			Panel p = new Panel();
			p.setLayout(new GridLayout(2,1));
			p.add(cb1);
			p.add(cb2);
		 	//f.add(cb1, BorderLayout.SOUTH);
			//f.add(cb2, BorderLayout.SOUTH);
			f.add(tf, BorderLayout.WEST);
			f.add(ta, BorderLayout.CENTER);
			f.setSize(700,600);
			f.setVisible(true);
			li.add("유치원졸");
			li.add("초졸");
			li.add("중졸");
			li.add("고졸");
			li.add("대졸");
	}
	
	
	
	
	
	public static void main(String[] args) {
		GUI_test gt = new GUI_test();
		gt.addLayout();
		
	}

}
