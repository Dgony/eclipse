package 자바응용프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 중국집키오스크 {
	static int total = 0;
	// 클래스 전체에서 접근이 가능
	// main 안에서 사용하기 위해서는 main이 static이 붙어있음.
	// main 밖에 있는 변수도 static이 붙어있어야함.
	
	public static void main(String[] args) {
		// 객체 가져오기
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.cyan);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
	
		Font font1 = new Font("굴림", 20, 50);
				
		JButton b1 = new JButton();
		b1.setText("짬뽕");
		b1.setBackground(Color.magenta);
		b1.setFont(font1);

		JButton b2 = new JButton();
		b2.setText("우동");
		b2.setBackground(Color.yellow);
		b2.setFont(font1);

		JButton b3 = new JButton();
		b3.setText("짜장");
		b3.setBackground(Color.blue);
		b3.setFont(font1);
		
		JLabel j = new JLabel();

		j.setFont(font1);
		j.setBackground(Color.blue);
		
		JLabel i1 = new JLabel();
		ImageIcon icon = new ImageIcon("계산기.jpg");
		i1.setIcon(icon);
		
		JLabel j2 = new JLabel();
		j2.setText("결제금액");
		j2.setFont(font1);
		j2.setForeground(Color.orange);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕 선택함");
				total++;
				j.setText("개수 : " + total + "개");
				j2.setText("결제금액 : " + total * 5000 + "원");
			}
		});
        b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동 선택함");
				total++;
				j.setText("개수 : " + total + "개");
				j2.setText("결제금액 : " + total * 5000 + "원");
			}
		});
        b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장 선택함");
				total++;
				j.setText("개수 : " + total + "개");
				j2.setText("결제금액 : " + total * 5000 + "원");
			}
		});
		
		// 얹기
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(j);
		f.add(i1);
		f.add(j2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
