package 배열;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범만들기 {
	
	static int start = 2;

	public static void main(String[] args) {
		// 영화이름, 사진, 평점을 포함하는 앨범
		// 좌, 우 버튼이 존재해서 버튼을 누르면 페이지가 넘어가도록 설계
		JFrame f = new JFrame();
		Font font = new Font("맑은 고딕", 1, 20);
	
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JButton b1 = new JButton(">>");
		JButton b2 = new JButton("<<");
		ImageIcon img1 = new ImageIcon();
		
		String[] movie = {"인사이드 아웃", "하이재킹", "퓨리오사", "원더랜드", "프렌치 수프"};
		String[] img2 = {"img1", "img2", "img3", "img4", "img5"};
		double[] count = {9.15, 8.90, 8.92, 6.52, 8.18};
		
		
		
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.yellow);
		l1.setFont(font);
		l2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		l1.setText(movie[start]);
		l2.setText(count[start]+"");
		l3.setText(img2[start]);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					start--;
				}
				l1.setText(movie[start]);
				l2.setText(count[start]+"");
				l3.setText(img2[start]);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (start < 5) {
					start++;
				}
				l1.setText(movie[start]);
				l2.setText(count[start]+"");
				l3.setText(img2[start]);
			}
		});
		
		
		f.add(l1, BorderLayout.NORTH);
		f.add(l2, BorderLayout.SOUTH);
		f.add(b1, BorderLayout.EAST);
		f.add(b2, BorderLayout.WEST);
		l3.setIcon(img1);
		f.add(l3, BorderLayout.CENTER);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
