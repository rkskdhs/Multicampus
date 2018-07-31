package c_Control;

import java.util.Calendar;

public class Ex01_If문_주민번호 {
//연산되는 숫자가 아닌 주민번호, 학번은 문자열로 잡아주기
	public static void main(String[] args) {
		
		String id = "950708-1354847";
		char sung = id.charAt(7);
		if(sung=='1'|| sung=='3'||sung=='5'||sung=='7') {//if조건 다음에 열어주고 print다음열 처음에 닫아주고
		  System.out.println("남자");
		}else if(sung=='2'||sung=='4'||sung=='6'||sung=='8' ){
			System.out.println("여자");
		}
		String yeondo = id.substring(0,2);
				int nai = Integer.parseInt(yeondo);
				
				Calendar cal= Calendar.getInstance();
				System.out.println(cal.get(Calendar.YEAR));
				int aaa = cal.get(Calendar.YEAR);
				

				int age = 0;//만약에 if에 해당하는 것이 없을경우를 위해 초기화해야됨
				
				if(sung=='1'||sung=='2') {
					age = aaa - (1900 + nai) +1;
				}
				
				else if(sung =='3'|| sung=='4') {
					age = aaa - (2000 + nai) +1;
				}
				
				System.out.println("나이:"+age);
		
	}

 }

