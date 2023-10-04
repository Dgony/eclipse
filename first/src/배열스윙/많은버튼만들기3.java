package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CookieHandler;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 많은버튼만들기3 {
	// 전역변수로 선언하자.
	static int count = 0;  // 전역변수는 자동초기화!
	static String no = ""; // 

	public static void main(String[] args) {
		// 1. 프레임을 만들어보세요.
		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		// 레이아웃 부품 설정하지 않음.
		// 3. 버튼을 넣을 배열을 먼저 만들어두세요. 500개
		// 4. 버틍르 500개 만들어서 배열에 넣어주세요, 반복문
		// 5. 배열에 있는 버튼을 꺼내서 위치등을 지정하고 배치해주세요.
		JFrame f = new JFrame();
		Random r = new Random();
		FlowLayout flow = new FlowLayout();

		f.setSize(1200, 1200);
		f.setTitle("나의 버튼들 3");
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);

		JButton[] buttons = new JButton[500];
		Color[] colors = { Color.red, Color.yellow, Color.magenta };
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText(i + "");
			int q = r.nextInt(3);
			buttons[i].setBackground(Color.pink);
			buttons[i].setForeground(colors[q]);
			buttons[i].setSize(200, 200);
			f.add(buttons[i]);
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					// 버튼클릭했을 때 처리하고 싶은 내용 쭉 써주면 됩니다.!
					String s = e.getActionCommand(); // 버튼 위에 글자를 가지고 와줘요
					no += s + " ";
					int pay = count * 10000;
					JOptionPane.showMessageDialog(f, s + "번을 클릭하셨군요.! "
					                              + "전체 결제 금액은 " + pay + "입니다.\n" + 
							                      "좌석번호는 " + no
							                      );
					JButton b = (JButton)e.getSource();
					b.setBackground(Color.black);
					b.setEnabled(false);
				}
			});
		} 

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
