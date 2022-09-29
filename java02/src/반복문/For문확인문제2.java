package 반복문;

public class For문확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 1; i<=1000;i= i+3) {
			
			if (sum >= 100) {
				break;
			}
			if (i%5 == 0) {
				//5의 배수는 통과 
				continue; // for문은 유지한채 통과
			}
			sum = sum + 1;
		}
		System.out.println(sum);
	}

}
