package ����;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String x = JOptionPane.showInputDialog("���� ���� �Է�");
		String y = JOptionPane.showInputDialog("���� ���� �Է�");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		int sq = x1 * y1;
		
		JOptionPane.showMessageDialog(null, "�簢���� ������ " + sq);
	}

}
