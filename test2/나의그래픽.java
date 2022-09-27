package test2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class 나의그래픽 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		f.getContentPane().setForeground(new Color(0, 255, 64));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setBounds(36, 66, 143, 34);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(191, 66, 219, 34);
		t1.setBackground(new Color(255, 128, 64));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.setBounds(36, 120, 374, 34);
		btnNewButton.setBorder(UIManager.getBorder("ToggleButton.border"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    		// 버튼 클릭 시 출력할 메세지
		    		JOptionPane.showMessageDialog(f, t1 + " 을(를) 드시고 싶군요.");
		    		
		    		
			    		String f1 = t1.getText();
			    		
			    		if (f1.equals("커피")) {
			    			JOptionPane.showMessageDialog(f, "카페로 갑시당.");
			    		} else if (f1.equals("고기")) {
			    			JOptionPane.showMessageDialog(f, "고깃집로 갑시당.");
			    		} else if (f1 == "비빔밥") {
			    			JOptionPane.showMessageDialog(f, "한식집으로 갑시당.");
			    		}
			    		else if (f1 == "돈까스") {
			    			JOptionPane.showMessageDialog(f, "일식집으로 갑시당.");
			    		}
			    		else if (f1 == "생선") {
			    			JOptionPane.showMessageDialog(f, "횟집으로 갑시당.");
			    		}
			    		
			    		/*
			    		if (f1 == "커피") {
			    			JOptionPane.showMessageDialog(f, "카페로 갑시당.");
			    		} else if (f1 == "고기") {
			    			JOptionPane.showMessageDialog(f, "고기집으로 갑시당.");
			    		} else if (f1 == "비빔밥") {
			    			JOptionPane.showMessageDialog(f, "한식집으로 갑시당.");
			    		} else if (f1 == "돈까스") {
			    			JOptionPane.showMessageDialog(f, "일식집으로 갑시당.");
			    		} else if (f1 == "생선") {
			    			JOptionPane.showMessageDialog(f, "횟집으로 갑시당.");
			    		}
			    		*/
				}
		});
		
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이");
		lblNewLabel_1.setBounds(36, 176, 143, 34);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBounds(191, 164, 219, 34);
		t2.setBackground(new Color(255, 128, 128));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.setBounds(36, 220, 374, 34);
		btnNewButton_1.setBorder(UIManager.getBorder("ToggleButton.border"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    		// 버튼 클릭 시 출력할 메세지
		    		JOptionPane.showMessageDialog(f, "내년에 몇살인지 알고싶으시군요.");
		    		//1. 두 수 입력받기 (string)
		    		String n1 = t2.getText();
		    		
		    		//2. 숫자로 변경후 정수변수에 대입
		    		int n11 = Integer.parseInt(n1);
		    		
		    		//3. 결과출력
		    		JOptionPane.showMessageDialog(f, "내년 나이는 : " + (n11 + 1));

		    		
		    	
				}
			});
		
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setBounds(36, 264, 143, 34);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setBounds(36, 308, 143, 34);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 16));
		f.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(191, 264, 219, 34);
		t3.setBackground(new Color(0, 255, 255));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(191, 315, 219, 34);
		t4.setBackground(new Color(0, 255, 255));
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.setBounds(36, 359, 374, 34);
		btnNewButton_2.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		btnNewButton_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		    		JOptionPane.showMessageDialog(f, "과목 평균이 궁금하시군요");
		    		//1. 두 수 입력받기 (string)
		    		String n3 = t3.getText();
		    		String n4 = t4.getText();
		    		
		    		//2. 숫자로 변경후 정수변수에 대입
		    		int n33 = Integer.parseInt(n3);
		    		int n44 = Integer.parseInt(n4);
		    		
		    		int sum = n33 + n44;
		    		double aver = sum / 2;
		    		//3. 결과출력
		    		JOptionPane.showMessageDialog(f, "과목 평균은 : " + aver + " 입니다");
		    
		    		
		    		// 초기화
		    		t1.setText("");
		    		t2.setText("");
		    		
		    	
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 16));
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}

}
