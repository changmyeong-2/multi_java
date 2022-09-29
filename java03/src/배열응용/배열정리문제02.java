package 배열응용;

import java.util.Scanner;

public class 배열정리문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int[] num = new int[5];
	      
	      for (int i = 0; i < 5; i++) {
	         System.out.print("숫자입력>>");
	         num[i] = sc.nextInt(); // 외부입력은 모두 String, nextInt() String -> int
	      }
	      System.out.println(num[0] + num[2]);
	      
	      String[] lang = new String[3];
	      
	      for (int i = 0; i < 3; i++) {
		         System.out.print("언어입력>>");
		         lang[i] = sc.nextLine(); // 외부입력은 모두 String, nextInt() String -> int
		      }
	      System.out.println(lang[0] +"보다는 " + lang[2]);
	}

}
