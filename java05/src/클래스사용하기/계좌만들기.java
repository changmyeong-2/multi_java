package 클래스사용하기;

import java.util.Scanner;

import 클래스만들기.계좌;

public class 계좌만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		계좌 dad = new 계좌();
		dad.이름 = "홍길동";
		dad.계좌이름 = "적금";
		dad.금액 = 1000;
		
		dad.입금하다();
		dad.출금하다();
		
		
		계좌 신설 = new 계좌();
		신설.계좌신설();
		신설.이름 = sc.next();
		신설.계좌이름 = sc.next();
		신설.금액 = sc.nextInt();
		신설.입금하다();
		신설.출금하다();
	}

}
