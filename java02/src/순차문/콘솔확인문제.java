package 순차문;

import java.util.Scanner;

public class 콘솔확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		
		String age = sc.next();
		
		int age1 = Integer.parseInt(age);
		
		int age2 = age1 + 1;
		
		System.out.println("내년 나이는 " + age2 + "세");
		
		System.out.print("키를 입력 >> ");
		
		double height = sc.nextDouble();
		
		double height1 = height + 10;
		
		System.out.println("당신의 키는 " + height1);
		
		System.out.print("몸무게를 입력 >> ");
		
		double weight = sc.nextDouble();
		
		double weight1 = weight - 10;
		
		System.out.println("당신의 몸무게는 " + weight1);
		
		System.out.println("저녁을 먹었는지 입력 (true / false) >>");
		
		String dinner = sc.next();
		
		if (dinner.equals(dinner) == true) {
			System.out.println("당신은 저녁을 먹었습니다.");
		} else {
			System.out.println("당신은 저녁을 먹지 않았습니다.");
			}
				
		System.out.println("올해의 목표는 >> ");
		
		String hope = sc.nextLine();
		
		System.out.println("나의 좌우명은 " + hope + "입니다.");
		
		
		
		
	}

}
