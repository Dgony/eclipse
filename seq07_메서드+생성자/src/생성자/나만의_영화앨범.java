package 생성자;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나만의_영화앨범 {
	
	public static int start = 2;
	
	public static void main(String[] args) {
		String[] title = { "30일", "화사한그녀", "천박사 퇴마 연구소 : 설경의 비밀", "1947 보스톤", "화란" };
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		double[] jumsu = { 11.1, 22.2, 33.3, 44.4, 55.5 };
//		System.out.println(title[0] + " " + img[0] + " " + jumsu[0]);
				
		JFrame f = new JFrame("나의 영화 앨범");
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.pink);
		
		// 라벨 3개
		// 버튼 2개
		// 폰트
				
		JLabel top = new JLabel(title[start]);
		ImageIcon icon = new ImageIcon(img[start]);
		JLabel center = new JLabel();
		center.setIcon(icon);
		JLabel under = new JLabel(String.valueOf(jumsu[start]));
		
		JButton	left = new JButton("<<");
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 0) {
					JOptionPane.showMessageDialog(f, "마지막입니다.");
				} else {
					start--;
				}
				top.setText(title[start]);
				under.setText(String.valueOf(jumsu[start]));
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
	
			}
		});
		
		JButton	right = new JButton(">>");
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 4) {
					JOptionPane.showMessageDialog(f, "마지막입니다.");
				} else {
					start++;
				}
				top.setText(title[start]);
				under.setText(String.valueOf(jumsu[start]));
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			}
		});
		
		Font font = new Font("궁서", Font.BOLD, 40);
		top.setFont(font);
		left.setFont(font);
		right.setFont(font);
		center.setFont(font);
		under.setFont(font);	
		
		left.setBackground(Color.green);
		left.setForeground(Color.magenta);
		right.setBackground(Color.green);
		right.setForeground(Color.magenta);
		top.setForeground(Color.red);
		under.setForeground(Color.red);
		
		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(right, BorderLayout.EAST);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		f.setVisible(true);
	}

}

