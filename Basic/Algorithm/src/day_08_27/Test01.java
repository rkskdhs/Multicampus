package day_08_27;

import java.io.Serializable;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(1<3);
		//System.out.println("1"<"3");
		System.out.println(isless("1","3"));
	
		
		System.out.println("1".compareTo("3")); //음수  <
		System.out.println("3".compareTo("1")); //양수  >
		System.out.println("3".compareTo("3")); //0    =
    	
		Account a1 = new Account("001", 900);
		Account a2 = new Account("007", 1900);
        //System.out.println(a1<a2);
		System.out.println(a1.compareTo(a2));
	}
	
	public static boolean isless(Comparable a, Comparable b) {
		return (a.compareTo(b) < 0);
	}
}


class Account implements Comparable<Account>,Serializable{
	String number;
	int money;
	public Account(String number, int money) {
		super();
		this.number = number;
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return number.compareTo(o.number);
	}
}



