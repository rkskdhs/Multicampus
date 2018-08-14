package thread.basic.ex;

class Producer extends Thread
{
	private BBangShop  shop;
	private String bread = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	

	public Producer( BBangShop s ){
		shop = s;	
	}
	
	public void run(){
		
		char c;
		
		for( int i=0; i<10 ; i++)
		{
			c = bread.charAt( (int)(Math.random() * 25 ) );
			shop.add( c );
			
			
			try{
				sleep( (int)(Math.random() * 500 ));
			} catch(InterruptedException ex){}
		}	
	}
}


class Consumer extends Thread
{
	private BBangShop  shop;
	
	public Consumer( BBangShop s ){
		shop = s;	
	}
	
	public void run(){
		
		char c;
		
		for( int i=0; i<10 ; i++)
		{
			c = shop.buy( );
			
				
			try{
				sleep( (int)(Math.random() * 500 ) );
			} catch(InterruptedException ex){}
		}	
	}
}


public class BBangShop
{
	private char breads[] = new char[6];
	private int  addnext = 0;
	private int  buynext = 0;
	
	private boolean isFull = false;
	private boolean isEmpty = true;
	
	public synchronized char buy()
	{
		
		while( isEmpty == true ){
			System.out.println("빵이 없습니다");
			try{
			wait();
			}catch(InterruptedException ex ){}
		}
		
		char buyBread = breads[ buynext ];
		
		buynext = ( buynext + 1 ) % 6;
		
		if( buynext == addnext ) isEmpty = true;
		
		isFull = false;
		System.out.println( buyBread + "빵을 산다 ");

		notify();
		
		return buyBread;
				
	
	}
	
	public synchronized void add( char newBread )
	{
		while( isFull == true ){
			System.out.println("빵이 가득차서 진열할수 없습니다 ");
			try{
			wait();
			}catch(InterruptedException ex ){}
		}
		
		breads[ addnext ] = newBread;
		
		addnext = ( addnext + 1 ) % 6;
		
		if( buynext == addnext ) isFull = true;
		
		isEmpty = false;
		System.out.println( newBread + "빵을 만들고 진열함");
		notify();
		
	}
	
	public static void main( String [] args )
	{
		BBangShop shop 	= new BBangShop();
		Producer  p		= new Producer( shop );
		Consumer  c		= new Consumer( shop );
		
		p.start();
		c.start();	
	}	
}