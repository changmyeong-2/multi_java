package ����;

import javax.swing.JOptionPane;

public class ģ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String add = "������";
		
		int age = 100;
		
		char gender = '��';
		
		String name = "������";
		
		String tel = "01012341234";
		String sn = "960619-1234321";
		
		String data = JOptionPane.showInputDialog("�̸��� �Է����ּ���.");
		String fage = JOptionPane.showInputDialog("������ �Է����ּ���.");
		String ftel = JOptionPane.showInputDialog("��ȣ�� �Է����ּ���.");
		String fgen = JOptionPane.showInputDialog("������ �Է����ּ���.");
		System.out.println("����� �Է��� �̸��� " + data + "���Դϴ�.");
		System.out.println("����� �Է��� ���̴� " + fage + "�Դϴ�.");
		System.out.println("����� �Է��� ��ȭ��ȣ�� " + ftel + "�Դϴ�.");
		System.out.println("����� �Է��� ������ " + fgen + "�Դϴ�.");
	}

}
