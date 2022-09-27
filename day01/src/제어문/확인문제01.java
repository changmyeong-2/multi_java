package 제어문;

public class 확인문제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
		
		char pw1 = 'p';
		char pw2 = 'q';
		if (pw1 == pw2) {
			System.out.println("pass!");
			
		} else {
			System.out.println("재입력");
		}
		
		// 2.
		double day1 = 80;
		double day2 = 77.8;
		double weight = day1 - day2;
		if(weight > 2) {
			System.out.println("다이어트 성공!!");
		} else {
			System.out.println("다이어트 실패!!");
		}
		
		//3.
		if(pw1 == pw2 && weight > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		
		//4.
		int a = 66;
		int b = 77;
		int c = 88;
		int d = 99;
		int sum = a + b + c + d;
		double aver = sum / 4;
		
		System.out.println("1학기 평균 성적은 : " + aver);
		
		//5.
		double pi = 3.14;
		double r = 2.2;
		
		double sq = pi * (r * r);
		System.out.println("원의 면적은 : " + sq);
		
	}

}
