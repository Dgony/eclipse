package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI의이벤트처리 implements ActionListener{
	
	static JButton b1, b2;
	static JTextArea t1;

	public static void main(String[] args) {
		// 버튼을 누르면 글자를 추가하는 코드 작성 예정
		JFrame f = new JFrame();
		b1 = new JButton();
		b2 = new JButton();
		t1 = new JTextArea(6, 13);
		Font font = new Font("맑은 고딕", 1, 30);
		FlowLayout flow = new FlowLayout();
		
		
		f.getContentPane().setBackground(Color.green);
		f.setSize(500, 500);
		f.setLayout(flow);
		
		b1.setText("나를 눌러라!");
		b2.setText("나도 눌러라!");
		b1.setFont(font);
		b2.setFont(font);
		t1.setFont(font);
		
		GUI의이벤트처리 버튼처리 = new GUI의이벤트처리();
		b1.addActionListener(버튼처리);
		b2.addActionListener(버튼처리);
		// addactionlistener의 매개변수가 클래스, 인터페이스 일 때 
		// 매개변수의 actionPerformed 라는 메서드를 잡아줌 - 액션 활성화
		
		f.add(b1);
		f.add(b2);
		f.add(t1);
		
//		b1.addActionListener(new ActionListener() {
//			// 이벤트 처리를 위한 메서드인데, ActionListener라는 인터페이스로 추정됨.
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) { // e라는 이벤트가 b1인 경우
			t1.append("b1을 눌렀습니다. \n");
		}
		if (e.getSource() == b2) {
			t1.append("b2를 눌렀습니다. \n");
		}
		
	}

}
