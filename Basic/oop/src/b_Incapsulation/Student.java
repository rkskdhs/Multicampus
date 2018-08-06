package b_Incapsulation;

public class Student {
//class=서로 다른 타입의 변수들(Fields) + 함수들(methods)
	
	//캡슐화 = 
	//변수는 Private/ 메소드는 Public ->외부에서 함부로 접근 못하게
	//각각의 변수를 처리하는 setters, getters 인지
	
	 private String name;//맴버변수
	 
	 int kor, eng, mat;
	 int total;
	 double avg;
	
	 public void calTotal() {
		 total = kor + eng + mat;
	 }
	 public void calAvg() {
		 avg = (double)total/3;
		 
	 }
	 
	 // setter ->private에 있는 것을 가져오기
	 public void setName(String name) {//지역변수
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	
}
