package 배열기본;

public class 배열확인문제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ex =  new int[5];
		System.out.println("----------------------");
		System.out.println(ex.length);
		
		ex[0] = 100;
		int end = ex.length; 
		ex[end-1] = 500;
		
		ex[3] = 200;
		
		for(int e : ex) {
			System.out.println(e);
		}
		for(int x = 0; x < ex.length; x++) {
			System.out.println(x);
			System.out.println(ex[x]);
		}
		
	}

}
