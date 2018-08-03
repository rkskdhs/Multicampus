package f_exception;
import java.io.FileInputStream;
public class Ex03_Throws {

	public static void main(String[] args) {
		try {
		readFile();
		}catch(Exception ex) {
			System.out.println("예외발생");
		}
	}
	static void readFile() throws Exception{//throws-> 예외 떠넘기기
		FileInputStream fis = new FileInputStream("a.x");
	fis.close();
	}
}
