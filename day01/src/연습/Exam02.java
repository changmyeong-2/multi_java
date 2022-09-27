package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("키를 입력");
		
		double height1 = Double.parseDouble(height);
		double weight = (height1 - 100.0) * 0.9;
		
		JOptionPane.showMessageDialog(null, "적정 체중은 " + weight);
	}

}
