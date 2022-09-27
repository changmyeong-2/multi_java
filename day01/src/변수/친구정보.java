package 변수;

import javax.swing.JOptionPane;

public class 친구정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String add = "강남구";
		
		int age = 100;
		
		char gender = '여';
		
		String name = "정샘물";
		
		String tel = "01012341234";
		String sn = "960619-1234321";
		
		String data = JOptionPane.showInputDialog("이름을 입력해주세요.");
		String fage = JOptionPane.showInputDialog("나이을 입력해주세요.");
		String ftel = JOptionPane.showInputDialog("번호을 입력해주세요.");
		String fgen = JOptionPane.showInputDialog("성별을 입력해주세요.");
		System.out.println("당신이 입력한 이름은 " + data + "님입니다.");
		System.out.println("당신이 입력한 나이는 " + fage + "입니다.");
		System.out.println("당신이 입력한 전화번호는 " + ftel + "입니다.");
		System.out.println("당신이 입력한 성별은 " + fgen + "입니다.");
	}

}
