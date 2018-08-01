package c_Control;

public class Ex09_369 {
	public static void main(String[] args) {
		
		
			int mok = 133;
				boolean su369= false;
				while(mok!=0) {
					int na = mok %10;
					if(na==3||na==6||na==9) {
						System.out.print("짝");
						su369 = true;
					}
					mok /=10; 
				}
				if(su369) {
					System.out.println();
				}else {
									}



	}
}
