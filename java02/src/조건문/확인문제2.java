package 조건문;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신이 먹고싶은 점심 메뉴는 ? (자장면, 라면, 회)");
		String food = sc.next();
		
		
		/*
		switch(food) {
		case "자장면" : System.out.println("중국집으로 가요.");
		case "라면" : System.out.println("분식집으로 가요.");
		case "회" : System.out.println("횟집으로 가요.");
		default: System.out.println("먹지마요.");
		*/
		
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (food.equals("회")) {
			System.out.println("횟집으로 가요.");
		}
		else {
			System.out.println("먹지마요.");
		
		}
	}

}
