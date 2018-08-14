package network.thread;

import java.io.*;
import java.net.*;

public class Client{
	
	public final static int PORT = 3333;
	public final static String HOST = "70.12.115.52";
	static int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static int b[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	
	public static void main( String args[] ) {
		Socket 			cl  = null;
		DataInputStream		br 	= null;
		DataOutputStream 	dos = null;
		
		int result[] = new int[10];
		
		/***********************************************
		* 소켓 객체, 입력스트림과 출력 스트림 객체 생성
		*/	
		try{
			cl = new Socket( HOST, PORT );
			br = new DataInputStream(cl.getInputStream());
			dos = new DataOutputStream(cl.getOutputStream());
			
			System.out.println("SimpleServer started..");
		
		//1. 소켓 객체 생성
		//2. 입력 스트림 생성
		//3. 출력 스트림 생성

			
		} catch ( Exception ex ) {
			System.out.println("Error is " + ex );	
		}


		/***********************************************
		* 숫자 배열을 서버에 전송
		*/					
		try{
			for( int i=0; i<a.length ; i++ ){
				// 1. a 배열을 서버에 전송
				dos.writeUTF(Integer.toString(a[i]));
			}
			for( int i=0; i<b.length ; i++ ){
				// 2. b 배열을 서버에 전송
				dos.writeUTF(Integer.toString(b[i]));
			}
    	} catch( Exception ex ) {
		    	System.out.println("error writing to server.." + ex );
		}
  
		/***********************************************
		* 서버로부터 결과를 읽어 옴
		*/
		try{
			for( int i=0  ; i<result.length; i++ ){
				// 1. 서버에서 읽어와서 result 배열에 저장
				String na =br.readUTF();
				result[i] = Integer.parseInt(na);
			}
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}

		/***********************************************
		* 결과를 화면에 출력
		*/		
		System.out.println("The sum of the two arrays : " );
		for( int i=0 ; i < result.length ; i++ )
				System.out.println( result[i] + " " );
		
		/***********************************************
		* 출력 스트림, 입력 스트림, 소켓 객체 닫기
		*/
		try{
			cl.close();
			br.close();
			dos.close();
		
		// 1. 출력 스트림 닫기
		// 2. 입력 스트림 닫기
		// 3. 소켓 닫기

		} catch( Exception ex ) {
			System.out.println("Error close.... " + ex );	
		}
	}		
}