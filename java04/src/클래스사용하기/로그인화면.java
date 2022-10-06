package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(503, 526);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(36, 205, 119, 38);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\a\\eclipse-workspace\\java04\\diary2.png"));
		lblNewLabel_1.setBounds(12, 10, 463, 185);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(208, 205, 267, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(36, 277, 145, 38);
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(208, 277, 267, 38);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();//id
				String s2 = t2.getText();//pw
				
				//id = "root", pw = "1234"이면, 일기쓰는 화면을 띄우고
				//아니면, JOptionPane으로 "입력값이 달라서 로그인실패입니다."
				//저 일기쓰기화면창을 띄워라!!
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인실패입니다.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\a\\eclipse-workspace\\java04\\login2.png"));
		btnNewButton.setBounds(25, 337, 205, 140);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2의 글자를 지워지는 것처럼 공백을 집어넣으세요.
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\a\\eclipse-workspace\\java04\\reset.png"));
		btnNewButton_1.setBounds(254, 337, 205, 140);
		f.getContentPane().add(btnNewButton_1);
		
		
		f.setVisible(true);
	}
}