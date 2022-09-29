package 반복문;

public class 반복문정리문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int sum = 0;
		for (int i = 33; i <= 222 ; i++) {
			sum = sum + i;
		}
		System.out.println("합은 : " + sum);
		
		//2.
		int sum2 = 0;
		for (int i2 = 55; i2 <= 4500; i2+=2) {
			sum2 = sum2 + i2;
		}
		System.out.println("합은 : " + sum2);
		
		//3. 
		int sum3 = 0;
		for (int i3 = 0; i3 <= 6000; i3+=5) {
			sum3 = sum3 + i3;
		}
		System.out.println("합은 : " + sum3);
		
	}

}
