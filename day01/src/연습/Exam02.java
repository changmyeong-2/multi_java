package ����;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height = JOptionPane.showInputDialog("Ű�� �Է�");
		
		double height1 = Double.parseDouble(height);
		double weight = (height1 - 100.0) * 0.9;
		
		JOptionPane.showMessageDialog(null, "���� ü���� " + weight);
	}

}
