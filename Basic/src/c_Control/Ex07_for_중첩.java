	package c_Control;
	
	public class Ex07_for_중첩 {
	
		public static void main(String[] args) {
			for (int n = 0 ; n<5 ; n++) {
				
			
				for(int i = 5 ; i>n ;i-- ) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	
	}
