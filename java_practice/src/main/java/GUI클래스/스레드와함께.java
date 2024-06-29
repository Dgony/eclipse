package GUI클래스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드와함께 {
	
	public static JFrame f;
	
	public static void main(String[] args) {
		
		f = new JFrame();
		Font font = new Font("맑은 고딕", 1, 20);
		FlowLayout flow = new FlowLayout(); 
		// 이런 세줄짜리 기본 설정을 담는 클래스도 상속으로 만들 수도 있는 것임
		
		스레드와함께시간 time = new 스레드와함께시간();
		스레드와함께카운트 count = new 스레드와함께카운트();
		count.l1 = new JLabel();
		time.l2 = new JLabel();
		
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(flow);
		count.l1.setFont(font);
		time.l2.setFont(font);
		
		
		f.add(count.l1);
		f.add(time.l2);
		
		count.start();
		time.start();
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
