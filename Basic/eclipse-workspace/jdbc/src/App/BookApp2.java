package App;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDao;
import vo.Bookvo;

public class BookApp2 {
	BookDao dao = new BookDao();
	BookService service = new BookServiceImpl(dao);
	
	Frame f;
	Button list,insert;
	TextField title,price;
	TextArea ta;
	
	
	BookApp2(){
		f = new Frame("new");
		list = new Button("list");
		insert = new Button("insert");
		title = new TextField("title");
		price = new TextField("price");
		ta = new TextArea(20,40);
		
		Panel p1 = new Panel();
		p1.add(list);
		p1.add(insert);
		Panel p2 = new Panel();
		p2.add(new Label("Title"));
		p2.add(title);
		p2.add(new Label("price"));
		p2.add(price);
		
		f.add(p1, BorderLayout.NORTH);
		f.add(p2,BorderLayout.SOUTH);
		f.add(ta);
		
		f.setSize(350,300);
		f.setVisible(true);
		
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText(" ");
				List<Bookvo> list = service.getbooks();
				Iterator<Bookvo> ii = list.iterator();
				while(ii.hasNext()) {
					Bookvo vo = ii.next();
					ta.append(vo.toString()+"\n");
				}
			}
		});
		
		insert.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
				service.insertBook(title.getText(), Integer.parseInt(price.getText()));
				}catch(NumberFormatException e1) {
					ta.setText(e1.toString());
					ta.append("price입력");
				}catch(Exception e1) {
					ta.setText(e1.toString());
					ta.append("no 음수");
				}
			}
		});
		
		
		
	}

	public static void main(String[] args) {

		new BookApp2();
		
		
	}

}
