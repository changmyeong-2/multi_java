package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;
		int w = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1;
			int data2 = Integer.parseInt(data); // 88
			if (data2 == target) {
				System.out.println("정답입니다!! 축하합니다!!");
				System.out.println("전체 시도횟수는 " + count);
				System.exit(0);
			} else {
				System.out.println("틀렸습니다!!");
				w = w + 1;
				if (target < data2) {
					System.out.println("다운");
				} else {
					System.out.println("업");
				}
				
			} 
		}
		JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
	}

}
