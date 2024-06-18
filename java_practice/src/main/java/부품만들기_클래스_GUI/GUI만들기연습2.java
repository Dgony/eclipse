package 부품만들기_클래스_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI만들기연습2 {

	public static void main(String[] args) {
		// java.swing을 이용한 GUI 화면을 만든다.
		// 커피를 먹으러 가고, 내년 나이를 계산하고, 국어 수학 점수의 평균을 내는 GUI
		// GUI를 만들 때는 컴포넌트 생성, 컴포넌트 설정, 컴포넌트 추가의 순서로 진행한다.
		
		// GUI 컴포넌트 생성
		JFrame f = new JFrame();
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		FlowLayout flow = new FlowLayout();
		Font font = new Font("맑은 고딕", 1, 20); // font 같은 컴포넌트는 설정으로 구분해야 되는지 고민이 된다.
		Font font2 = new Font("맑은 고딕", 1, 30);
		
		// GUI 컴포넌트 설정
		f.setSize(320, 500);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t1.setBackground(Color.orange);
		t2.setBackground(Color.pink);
		t3.setBackground(Color.cyan);
		t4.setBackground(Color.cyan);
		l1.setText("먹고 싶은 음식");
		l2.setText("당신의 나이는");
		l3.setText("국어 점수");
		l4.setText("수학 점수");
		b1.setText("어디로 갈까?");
		b2.setText("나의 내년 나이는?");
		b3.setText("두 과목 점수의 평균은?");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String place = t1.getText();
				JOptionPane.showMessageDialog(f, place + "를 먹으러 갑시다.");
				l5.setText(place + "를 먹으러 갑시다.");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int age = Integer.parseInt(t2.getText());
				int nextage = age + 1;
				JOptionPane.showMessageDialog(f, "내년 나이는 " + nextage + "살");
				l5.setText("내년 나이는 " + nextage + "살");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int language = Integer.parseInt(t3.getText());
				int math = Integer.parseInt(t4.getText());
				int avg = (language + math) / 2;
				JOptionPane.showMessageDialog(f, "두 과목의 평균 점수는 " + avg + "점");
				l5.setText("두 과목의 평균 점수는 " + avg + "점");
				
			}
		});
		
		// GUI 컴포넌트 추가
		f.add(l1);
		f.add(t1);
		f.add(b1);
		f.add(l2);
		f.add(t2);
		f.add(b2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b3);
		f.add(l5);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
