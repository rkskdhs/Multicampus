package g_inherit.bookshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Item i = null;
		System.out.println("1.책, 2.DVD, 3.CD");
		Scanner in = new Scanner(System.in);
		int sel = in.nextInt();
		switch(sel) {
		case1: i=new Book("","","","");
		case1: i=new DVD("","","","");
		case1: i=new Cd("","","","");
		}
		i.output(); //다형성 1. 부모변수의 자식 개체 생성 2. 오버라이딩 
	}

}
