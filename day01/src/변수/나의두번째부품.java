package ����;

import javax.swing.JOptionPane;

public class ���ǵι�°��ǰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ����� ���� ��ǰ�� �빮�ڷ� �ٷ� �� �� �ֵ��� �غ�Ǿ�����
		// System, JOptionPane, ���ڷ� ��ȯ���ִ� ��ǰ��(Integer)
		//JOptionPane �̿��ؼ� ���, �̸� �Է� --> ���
		
		// prompt(), �Է¿�
		
		String age = JOptionPane.showInputDialog("����� ���̸� �Է��ϼ���.");
		
		// ���� �Ⱦ��� ����� ���� ��ǰ�� new�� ������ ���� ����� ����
		// JFrame, Date ..
		//alert(), null: ����
		
		
		JOptionPane.showConfirmDialog(null, "���� ���̴� " + age);
	}

}
