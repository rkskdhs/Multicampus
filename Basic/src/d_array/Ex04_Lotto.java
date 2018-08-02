package d_array;

public class Ex04_Lotto {

	public static void main(String[] args) {
		int [] lotto =  new int [6];
		
		for (int i =0; i<lotto.length; i++) {//int의 소숫점을 잘라버리는 성질을 이용하여
			lotto[i] =(int) (Math.random()*45)+1;// math random-> 0.0<=  <1.0
			for(int j = 0; j<i; j++) {
				if(lotto[j]==lotto[i]) {//i에서 같은 수가 나왔다면 i에서 일은 빼줬다가 다시 더해 다시 뽑기
					i--;
					break;//이건 반복문을 깨주는 것 if가 아니에요
				}
			}
		}
		//정렬-버블-삽입/선택
		for(int a = 0; a<lotto.length;a++) {
			for(int i = 0; i<lotto.length - a-1; i++) {
				if(lotto[i]> lotto[i+1]) {
					int tmp = lotto [i];
					lotto[i] = lotto [i+1];
					lotto[i+1]=tmp;
				}
			}
		}
		
		
		//출력
		for (int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] +"/" );
		}
	}

}
