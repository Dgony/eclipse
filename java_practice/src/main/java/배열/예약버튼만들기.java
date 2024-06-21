package 배열;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 예약버튼만들기 {

	public static void main(String[] args) {
		// 버튼을 한 100개 만들어버리는 것
		// 버튼을 누르면 예약이 되는 시스템
		JFrame f = new JFrame();
		Font font = new Font("맑은 고딕", 1, 20);
		FlowLayout flow = new FlowLayout();
		
		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
		}
		
		f.setSize(1000, 1000);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.yellow);
		
		for (int i = 0; i < buttons.length; i++) {
			JButton b = buttons[i];
			b.setFont(font);
			b.setText(i + "");
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 이 클래스가 전역변수가 사용 불가능해서 가져옴
					int i = Integer.parseInt(s);
					b.setBackground(Color.green);
					JOptionPane.showMessageDialog(f, i + "번 좌석이 예매되었습니다.");
					
				}
			});
			f.add(b);
		}
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
