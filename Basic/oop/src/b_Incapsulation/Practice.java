package b_Incapsulation;


public class Practice {
		
	
		private int num1;
		private int num2;
		
		 
		
		public int getNum1() {
			return num1;
		}
		public void setNum1(int num1) {
			this.num1 = num1;
		}
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}
		
		
		public int addition() {
			int r = num1 + num2;
			return r;
		}
		int subtraction() {
			int r = num1 - num2;
			return r;
		}
		int multiplication() {
			int r = num1 * num2;
			return r;
		}
		double division() {
			double r = (double)num1/num2;
			return r;
		}//setter getter 는 계산이 아니라 값을 전달해주기 위함
		
		


		
}
