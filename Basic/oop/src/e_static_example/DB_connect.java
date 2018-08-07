package e_static_example;

public class DB_connect {

	private DB_connect() {
	private static DB_connect db = null;
	
		System.out.println("DB연결");
	}
	
	public static DB_connect getInstance() {
		if(db==null)db=new DB_connect();//처음 단 한번만 객체 생성이 가능함 
		return db;
	}
}
