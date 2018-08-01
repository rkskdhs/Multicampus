package c_Control;

public class Ex11_Break_continue {

	public static void main(String[] args) {
		END://라벨이 부착된
		for(int i = 0; i<2 ; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) break END;
				System.out.println("<"+ i + ","+ j +">");

			}
			System.out.println("데이타");
		}
	}//통으로 벗어나기 원한다면 벗어나고자하는 반복문의 앞
}