package test2;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class 나의첫번째윈도우 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(448, 640);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\wodlf\\Desktop\\giphy.gif"));
	    f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
	      
	    JTextArea textArea = new JTextArea();
	    f.getContentPane().add(textArea, BorderLayout.CENTER);
	      
	    textField = new JTextField();
	    f.getContentPane().add(textField, BorderLayout.SOUTH);
	    textField.setColumns(10);
	      
	    JLabel lblNewLabel = new JLabel("돌아간다");
	    f.getContentPane().add(lblNewLabel, BorderLayout.EAST);
	    f.setVisible(true);
	}
}
