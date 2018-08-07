package f_innerclass;
//메인 함수에만 public 씀
class Outer{
	static class inner{
		static void najabara() {
			System.out.println("잡아봐");
		}
	}
	
}

public class Main {

	public static void main(String[] args) {//원래는 class에 static 못쓰는데  inner는 outer의 부속이라고 보기 때문
		//Outer o =new Outer();//밖부터 객체를 형성 호출
	//	Outer.inner in = new inner();
	//	Outer.inner in = new Outer.inner();
		//in.najabara();
		Outer.inner.najabara();

	}

}

