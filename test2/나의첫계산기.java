package test2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 나의첫계산기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 64));
	    f.setSize(500, 500);
	    f.getContentPane().setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("숫자 1");
	    lblNewLabel.setFont(new Font("굴림", Font.BOLD, 14));
	    lblNewLabel.setBounds(50, 58, 102, 47);
	    f.getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("숫자 2");
	    lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(50, 115, 102, 47);
	    f.getContentPane().add(lblNewLabel_1);
	    
	    t1 = new JTextField();
	    t1.setBounds(164, 71, 210, 34);
	    f.getContentPane().add(t1);
	    t1.setColumns(10);
	    
	    t2 = new JTextField();
	    t2.setBounds(164, 115, 210, 34);
	    f.getContentPane().add(t2);
	    t2.setColumns(10);
	    
	    JButton plus = new JButton("더하기");
	    plus.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// 버튼 클릭 시 출력할 메세지
	    		JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
	    		//1. 두 수 입력받기 (string)
	    		String n1 = t1.getText();
	    		String n2 = t2.getText();
	    		
	    		//2. 숫자로 변경후 정수변수에 대입
	    		int n11 = Integer.parseInt(n1);
	    		int n22 = Integer.parseInt(n2);
	    		
	    		//3. 결과출력
	    		JOptionPane.showMessageDialog(f, n11 + n22);
	    
	    		
	    		// 초기화
	    		t1.setText("");
	    		t2.setText("");
	    		
	    	}
	    });
	    plus.setBounds(39, 211, 102, 47);
	    f.getContentPane().add(plus);
	    
	    JButton minus = new JButton("빼기");
	    minus.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//버튼 클릭 시 출력할 메세지
	    		JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
	    		
	    		//1. 두 수 입력받기 (String)
	    		String n1 = t1.getText();
	    		String n2 = t2.getText();
	    		
	    		//2. 숫자로 변경후 정수변수에 대입
	    		int n11 = Integer.parseInt(n1);
	    		int n22 = Integer.parseInt(n2);
	    		
	    		//3. 결과출력
	    		JOptionPane.showMessageDialog(f, n11 - n22);
	    	}
	    });
	    minus.setBounds(142, 211, 102, 47);
	    f.getContentPane().add(minus);
	    
	    JButton mul = new JButton("곱하기");
	    mul.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//버튼 클릭 시 출력할 메세지
	    		JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
	    		
	    		//1. 두 수 입력받기 (String)
	    		String n1 = t1.getText();
	    		String n2 = t2.getText();
	    		
	    		//2. 숫자로 변경후 정수변수에 대입
	    		int n11 = Integer.parseInt(n1);
	    		int n22 = Integer.parseInt(n2);
	    		
	    		//3. 결과출력
	    		JOptionPane.showMessageDialog(f, n11 * n22);
	    	}
	    });
	    mul.setBounds(245, 211, 118, 47);
	    f.getContentPane().add(mul);
	    
	    JButton div = new JButton("나누기");
	    div.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
	    		
	    		//1. 두 수 입력받기 (String)
	    		String n1 = t1.getText();
	    		String n2 = t2.getText();
	    		
	    		//2. 숫자로 변경후 정수변수에 대입
	    		int n11 = Integer.parseInt(n1);
	    		int n22 = Integer.parseInt(n2);
	    		
	    		//3. 결과출력
	    		JOptionPane.showMessageDialog(f, n11 / n22);
	    	}
	    });
	    div.setBounds(364, 210, 97, 48);
	    f.getContentPane().add(div);
	    f.setVisible(true);
	}
}
