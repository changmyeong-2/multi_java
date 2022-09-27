package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = JOptionPane.showInputDialog("가로 길이 입력");
		String y = JOptionPane.showInputDialog("세로 길이 입력");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		int sq = x1 * y1;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + sq);
	}

}
