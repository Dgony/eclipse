package 부품만들기_클래스;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 입력화면만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		// 각종 객체들을 표시할 수 있는 창을 만드는 객체 f
		
		FlowLayout flow = new FlowLayout();
		// 객체들이 물흐르는듯한 배치를 가질 수 있도록 하는 객체 flow
		// 얘가 없으면 모든 객체들이 한곳에 몰려 겹쳐보이는 현상 발생
		
		JButton b1 = new JButton("더하기"); // f에 올려놓을 버튼을 만드는 jbutton시리즈의 버튼 객체1
		JButton b2 = new JButton("빼기"); // f에 올려놓을 버튼을 만드는 jbutton시리즈의 버튼 객체2
		
		JTextField t1 = new JTextField("입력창1");
		JTextField t2 = new JTextField("입력창1");
		
		f.setSize(1000, 1000); // f의 크기를 정하는 메서드
		f.getContentPane().setBackground(Color.white); // f의 배경색을 정하는 메섣,
		f.getContentPane().setLayout(flow); // f에 레이아웃 flow를 적용시키는 메서드
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.cyan);
		b1.setSize(100, 100);
		b2.setSize(100, 100);
		
		
		// 만든 객체를 f에 추가해주는 add메서드
		f.add(t1);
		f.add(t2);
		f.add(b1); 
		f.add(b2);
		
		f.setVisible(true);

	}

}
