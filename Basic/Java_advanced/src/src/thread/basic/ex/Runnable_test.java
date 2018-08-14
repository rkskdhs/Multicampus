package thread.basic.ex;

public class Runnable_test {

	public static void main(String[] args) {
		makeCar2 mc1 = new makeCar2("차틀만들기");
		Thread t1 = new Thread (mc1);
		t1.start();
		
		new Thread(new makeCar2("엔진부착")).start();
	}

}
class makeCar2 implements Runnable{
	String work;
	makeCar2(String work){
		this.work = work;
	}
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(work+"작업중");
			try {
				Thread.sleep(500);
			}catch(Exception ex) {

			}
		}
	}
}