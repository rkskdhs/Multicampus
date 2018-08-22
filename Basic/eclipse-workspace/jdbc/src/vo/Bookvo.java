package vo;

import java.io.Serializable;

public class Bookvo extends Object implements Serializable {
	private int bookid;
	private String title;
	private int price;
	private String pubdate;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public Bookvo() {
		super();
	}
	@Override
	public String toString() {
		return "Bookvo [bookid=" + bookid + ", title=" + title + ", price=" + price + ", pubdate=" + pubdate + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookid;
		result = prime * result + price;
		result = prime * result + ((pubdate == null) ? 0 : pubdate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookvo other = (Bookvo) obj;
		if (bookid != other.bookid)
			return false;
		if (price != other.price)
			return false;
		if (pubdate == null) {
			if (other.pubdate != null)
				return false;
		} else if (!pubdate.equals(other.pubdate))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
