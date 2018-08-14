package thread.basic.ex;

public class Thread_test {
	public static void main(String[] args) {
		//[2]쓰레드 클래스 객체 생성
		//[3] run() 호출 -> start()
		makeCar1 mc1 = new makeCar1("차틀만들기");
		mc1.start();
		
		makeCar1 mc2 = new makeCar1("엔진 부착");
		mc2.start();		
	}

}


//[1] 쓰레드 클래스 선언 
//쓰레드 클래스 상속 or Runnable 구현
// run() overriding
class makeCar1 extends Thread{
	String work;
	makeCar1(String work){
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