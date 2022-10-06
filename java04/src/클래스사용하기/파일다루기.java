package 클래스사용하기;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1 = JOptionPane.showInputDialog("날짜입력");
			String s2 = JOptionPane.showInputDialog("날짜입력");
			String s3 = JOptionPane.showInputDialog("날짜입력");
			
		
			try {
				FileWriter file = new FileWriter("file.txt");
				
				file.write(s1 + "\n");
				file.write(s2 + "\n");
				file.write(s3 + "\n");
				
				file.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("파일에 저장 중 에러발생");
			}
	}

}
