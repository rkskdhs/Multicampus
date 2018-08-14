package thread.basic.ex;

class Count{
	int i;
	void add () {
		synchronized(this) {
			i++;
		}
	}
}
class ThreadCount extends Thread{
	Count cnt;
	ThreadCount(Count cnt){
		this.cnt = cnt;
	}
	public void run() {
		for(int i = 0; i<100000000; i++) {
			cnt.add();
		}
	}
}
public class SynchTest {

	public static void main(String[] args) {
		Count c = new Count();
		ThreadCount tc1 = new ThreadCount(c);
		tc1.start();

		ThreadCount tc2 = new ThreadCount(c);
		tc2.start();

		try {
			tc1.join();
			tc2.join();
		}catch(Exception ex) {}
		System.out.println("i= " +c.i);


	}

}
