package c_Constructure;

public class Student {
//class=서로 다른 타입의 변수들(Fields) + 함수들(methods)
	
	//캡슐화 = 
	//변수는 Private/ 메소드는 Public ->외부에서 함부로 접근 못하게
	//각각의 변수를 처리하는 setters, getters 인지
	
	 private String name;//맴버변수
	 
	 private int kor, eng, mat;
	 private int total;
	 private double avg;
	 
	 public Student() {//default 값으로 보면 된다 입력값을 없앨경우에
			name = "이름없음";//
			kor = eng = mat = 50;// or 
			System.out.println("기본 생성자");
		 }
	 /*this= 맴버(변수, 메소드)를 지칭하는 것
	  *this() : 다른 생성자를 호출시에 사용
					첫줄에 기술
	  */
	 
	 //생성자(constructor)
	 //-리턴형이 없음(void 안됨)
	 //-클래스명과 동일한 이름 지정
	 //- 오버로딩 가능함 같은 함수이지만 인자가 다르면 다르게 인식.
	 //-맴버 변수 초기화
	 public Student(String name, int kor, int eng, int mat) {
		 this.name = name;
		 this.kor =kor;
		 this.eng = eng;
		 this.mat = mat;
		 System.out.println("인자 생성자");
		 //한번에 초기화 시키는 것 
	 }//이걸 지정안해줄경우 jvm이 알아서 해준다 하지만 하나라도 입력하면 안되유
	
	
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
