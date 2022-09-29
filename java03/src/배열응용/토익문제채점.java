package 배열응용;

import java.util.Iterator;
import java.util.Random;

public class 토익문제채점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		
		//990번 반복
		for (int i = 0; i < 내답안.length; i++) {
			//0~3 + 1 => 1~4
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
		}
		System.out.println("번호: \t 답안 \t 내답");
		System.out.println("-----------------");
		//990번 반복
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + 1 + ":\t" + "\t" + 내답안[i]);
		}
		
		//채점
		int jum = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jum++; //jumsu = jumsu + 1; ==> 증감연산자

			}
		}
		
	}

}
