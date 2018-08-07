package z_test;
import java.awt.*; //부모는 한번만
public class Is_a extends Frame {

	public Is_a(){
		Button b = new Button("확인");
		add(b);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		Is_a a = new Is_a();
	}

}
