package a_datatype;

public class Ex09_Speed {

	public static void main(String[] args) {
		long start = 0L;
		long end = 0L;
		//string문자열 추가
		String str = "";
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			str =str +"A";
		}
		end =System.currentTimeMillis()- start;
		System.out.println("string ;" +end);
		StringBuffer sb = new StringBuffer("");
		start = System.currentTimeMillis();
		for(int i=0; i<50000; i++) {
			sb.append("A");
		}
		end =System.currentTimeMillis()-start;
		System.out.println("StringBuffer:" + end);
		
		

	}

}
