package 배열스윙;

import java.awt.Color;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(800, 500);
		f.setTitle("나의 버튼들");
		f.setLayout(null); // 이러면 동서남북 가운데의 기본 배치설정이 없어짐
		
		Random r = new Random();
		
		JButton[] buttons = new JButton[200];
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}
		
		System.out.println(Arrays.toString(buttons));
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(1200);
			int y = r.nextInt(800);
			buttons[i].setBackground(Color.yellow);
			buttons[i].setForeground(Color.red);
			buttons[i].setBounds(x, y, 100, 100);
			f.add(buttons[i]);
		}
				

		// x누르면 단순히 보이지 않는게 아니라 꺼지게 만들기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 꼭 끝으로 보내기
		f.setVisible(true);
	}

}
