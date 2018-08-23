package Service;

import java.util.List;

import dao.BookDao;
import vo.Bookvo;

public class BookServiceImpl implements BookService {
	
	//dao ���
	private BookDao dao = null; //���� ĸ��ȭ
	

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
		this.dao = dao;//����ϰ��� �ϴ� dao ���� ��� �̸� ���ؼ�
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
