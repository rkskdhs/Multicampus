package day_08_27;

public class simplelist {
	node head;
	int size = 0;
	
	
	public simplelist () {}
	public simplelist(node head, int size) {
		super();
		this.head = head;
		this.size = size;
	}

	public void setHead(node head) {
		this.head = head;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public node getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	
	}
	public void add(node data) {
		
	}
	
	

}
