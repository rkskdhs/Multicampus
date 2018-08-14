package thread.basic.ex;

class Bread 
{
	String bread;
	boolean isCheck = false;

	public void setBread( String bread )
	{
		this.bread = bread;
		isCheck = true;
		try {
			notifyAll();//블락 상태의 모든 것을 가져온다.
		}catch(Exception ex) {
			
		}
	}	

	public String getBread()
	{
		if (isCheck==false) {
			try {
				synchronized (this) {//notify할 떄 잡아주는 것
					wait();
				}
			}catch(Exception ex) {

			}
		}
		return bread;
	}
}

class Baker extends Thread
{
	Bread bbang;

	Baker( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		bbang.setBread("맛있는 빵");
	}
}

class Customer extends Thread
{
	Bread bbang;

	Customer( Bread bbang )
	{
		this.bbang = bbang;
	}
	public void run()
	{
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class BreadTest
{
	public static void main(String[] args) 
	{
		Bread  bread = new Bread();

		Baker  baker = new Baker( bread );
		Customer customer = new Customer( bread );


		customer.start();
		baker.start();

		try{
			customer.join();
			baker.join();			
		}catch( Exception ex ){}

	}
}
