package 조건문;

import java.sql.Date;

public class 확인문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		int hour = date.getHours();
		int month = date.getMonth();
		int today = date.getDate();
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
	}

}
