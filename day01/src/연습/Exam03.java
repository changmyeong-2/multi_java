package ����;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("��Ż� �Է�");
		String num = JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		
		String dia = tel + num + name;
		
		JOptionPane.showMessageDialog(null, "���̾�α׷�  " + name + "���� " + tel + "�� " + num + " ��ȣ�� ���ԵǼ̽��ϴ�.");
		JOptionPane.showMessageDialog(null, dia);
	}

}
