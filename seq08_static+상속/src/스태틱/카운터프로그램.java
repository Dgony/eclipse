package 스태틱;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	public static int count; // 전역변수라 0으로 초기화

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(435, 400);
		f.setLayout(new FlowLayout());
		

		JButton plus = new JButton("1 더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1 빼기");

		JLabel number = new JLabel("0");

		Font font = new Font("굴림", Font.BOLD, 20);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);

		number.setFont(new Font("궁서", Font.BOLD, 50));
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);

		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(String.valueOf(count));
			}
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(String.valueOf(count));
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
