package 부품만들기_클래스_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class j시리즈_참조형변수 {

	public static void main(String[] args) {
		final JFrame f = new JFrame();
		JButton b = new JButton("나는 버튼...!");
		// jframe으로 만들어낸 인스턴스(객체)를 지칭하는 참조형 변수
		// 여태까지의 기본데이터타입의 변수와는 다르게
		// 값이 아닌 객체의 주소를 지정하는 참조형 데이터를 가지는 변수

		f.setSize(1000, 500);
		
		f.add(b);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나에요!");

			}
		});

		
		f.setVisible(true);

	}

}
