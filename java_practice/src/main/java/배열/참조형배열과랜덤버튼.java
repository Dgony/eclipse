package 배열;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형배열과랜덤버튼 {
	
	public static void main(String[] args) {
		// 참조형 변수도 기본 데이터처럼 배열을 만들 수 있다.  
		JFrame f = new JFrame();
		JButton[] buttons = new JButton[100];
		Random r = new Random();
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼이에용");
		}
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(500);
			int y = r.nextInt(500);
			buttons[i].setBounds(x, y, 50, 50);
			f.add(buttons[i]);
		}
		
		f.setTitle("버튼 100개 랜덤 배치");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.yellow);
		f.setLayout(null);
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
