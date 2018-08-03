package f_exception;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex02_TryChatch {//프로그램이 멈추지 않고 진행할 수 있도록 만들어줌

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");//예외처리하라고 말하는 것
			fis.read();
			System.out.println("파일처리");
		
			int su = 10/0;
			
		}catch(FileNotFoundException ex) {
			
			System.out.println("파일읽기 실패:"+ex.getMessage());
		}catch(IOException ex) {
			System.out.println("읽기 실패");
		}catch(Exception ex) {
			System.out.println("그외의  예외");
		}
	}
}