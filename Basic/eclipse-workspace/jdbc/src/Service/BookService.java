package Service;
import java.util.*;
import vo.Bookvo;
public interface BookService {
	public abstract int insertBook(String title, int price);
	public abstract int deleteBook(int bookid, int price);
	public abstract List<Bookvo> searchBook(String title);
	public Bookvo searchBook(int bookid);
	public List<Bookvo> getbooks();
	public abstract int updatebook(int bookid);
	
}
