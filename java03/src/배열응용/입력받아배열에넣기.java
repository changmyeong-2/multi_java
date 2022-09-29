package 배열응용;

import java.util.Iterator;
import java.util.Scanner;

public class 입력받아배열에넣기 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      // 키보드로 입력하는 부품을 ram에 가져다 놓음
      Scanner sc = new Scanner(System.in);
      int[] num = new int[5];

      for (int i = 0; i < 5; i++) {
         System.out.print("숫자입력>>");
         num[i] = sc.nextInt(); // 외부입력은 모두 String, nextInt() String -> int

      }

   }

}