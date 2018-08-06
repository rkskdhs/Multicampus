package A_Basic;

public class Student {
//class=서로 다른 타입의 변수들(Fields) + 함수들(mothods)
	 String name;
	 int kor, eng, mat;
	 int total;
	 double avg;
	 
	 void calTotal() {
		 total = kor + eng + mat;
	 }//
	 void calAvg() {
		 avg = (double)total/3;
		 
	 }
}
