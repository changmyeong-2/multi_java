package 클래스사용하기;

import 클래스만들기.계산기;

public class 내가게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계산기 cal = new 계산기();
		int result = cal.add(200, 100);
		double result2 = cal.add(100, 22.2);
		double result3 = cal.add(11.1, 22.2);
		String result4 = cal.add("ok", 100);
		int result5 = cal.multi(3000, 4);
		double result6 = cal.div(result5, 4);
		
		System.out.println("더한 값1은 " + result);
		
		System.out.println("더한 값2은 " + result2);
		System.out.println("더한 값3은 " + result3);
		System.out.println("더한 값4은 " + result4);
		
		System.out.println("계산 한 값5는 " + result5);
		System.out.println("계산 한 값6는 " + result6);
		
	}
	

}
