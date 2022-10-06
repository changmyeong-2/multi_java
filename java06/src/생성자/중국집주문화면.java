package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class 중국집주문화면 {
	static int count;
	static final int PRICE = 5000;
	
	private static JTextField t1;
	static JLabel result;
	static int 짬뽕count;
	static int 짜장count;
	static int 우동count;
	

	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(823, 574);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(489, 37, 68, 46);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(556, 32, 239, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("C:\\Users\\a\\eclipse-workspace\\java06\\\uC9DC\uC7A5\uBA74.png"));
		center.setFont(new Font("굴림", Font.BOLD, 20));
		center.setBounds(124, 96, 559, 368);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("\uACB0\uC81C\uAE08\uC561");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(124, 464, 555, 61);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				t1.setText(count + "개");
				ImageIcon icon = new ImageIcon("");
				center.setIcon(icon);
				result.setText("결제금액 : " + count * PRICE + "원");
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(12, 10, 142, 66);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(166, 10, 142, 66);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9DC\uC7A5");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(320, 10, 142, 66);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
