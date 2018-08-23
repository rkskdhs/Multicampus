package App;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDao;
import vo.Bookvo;

public class BookApp {

	public static void main(String[] args) {
		BookDao dao = new BookDao();
		BookService service = new BookServiceImpl(dao); 

		String msg = JOptionPane("title/price");
		String bookdata[]=msg.split("/");
		
		try {
			service.insertBook(bookdata[0], Integer.parseInt(bookdata[1]));
		}catch(Exception e) {
			e.getMessage();
			System.out.println("����");
		}
		
			
	


		try {
			service.insertBook("�ƶ��", 90000);
		}catch(Exception e) {
			e.getMessage();
			System.out.println("insert ���� �߻�");
		}

		List<vo.Bookvo> list = service.getbooks();
		Iterator<Bookvo> ii = list.iterator();
		while (ii.hasNext()) {
			Bookvo vo = ii.next();
			System.out.printf("����:%15s, ����: %6d %n", vo.getTitle(),vo.getPrice());

		}

		service.updatebook(3);

		service.deleteBook(3,3);

		service.searchBook("~~~~");
	}

	private static String JOptionPane(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


