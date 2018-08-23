package Service;

import java.util.List;

import dao.BookDao;
import vo.Bookvo;

public class BookServiceImpl implements BookService {
	
	//dao 사용
	private BookDao dao = null; //약한 캡슐화
	

	public BookServiceImpl() {
		super();
	}
	
	public BookServiceImpl(BookDao dao) {
		super();
		this.dao = dao;
	}

	public BookDao getDao() {
		return dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;//사용하고자 하는 dao 있을 경우 이를 통해서
	}

	@Override
	public int insertBook(String title, int price) {
		
		return dao.insertBook(title, price);
	}

	@Override
	public int deleteBook(int bookid, int price) {

		return dao.deleteBook(bookid, price);
	}

	@Override
	public List<Bookvo> searchBook(String title) {

		return null;
	}

	@Override
	public Bookvo searchBook(int bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bookvo> getbooks() {
		// TODO Auto-generated method stub
		return dao.getbooks();
	}

	@Override
	public int updatebook(int bookid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
