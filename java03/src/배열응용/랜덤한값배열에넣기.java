package 배열응용;

import java.util.Random;

public class 랜덤한값배열에넣기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		Random r = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			// 0~44 + 1 > 1~45
		}
		
		for (int x : lotto) {
			System.out.println(x + " ");
		}
		
	}

}
