package 반복문과랜덤;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// 랜덤한 숫자를 맞출 때까지 진행되는 GUI 생성
		// swing, 랜덤, while반복문, 조건문의 조화
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("당신이 생각한 숫자를 입력");
		JLabel l2 = new JLabel();
		JTextField t1 = new JTextField(10);
		JButton b1 = new JButton("숫자를 맞춰보자!");
		FlowLayout flow = new FlowLayout();
		Font font = new Font("맑은 고딕", 1, 30);
		
		f.getContentPane().setBackground(Color.green);
		f.setLayout(flow);
		f.setSize(500, 500);
		t1.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		b1.setFont(font);

		System.out.println(target);
		b1.addActionListener(new ActionListener() {
			int num = 0;
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				num = Integer.parseInt(t1.getText());
				if (num == target) {
					l2.setText("정답입니다~~~!");
				} else {
					l2.setText("오답입니다~~~!");
				}
			}
		});
		
		f.add(l1);
		f.add(t1);
		f.add(b1);
		f.add(l2);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}
