package 자바응용프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 먼저 ram에 다 가져다 놓기
		JFrame f = new JFrame();
		f.setSize(500, 500);
		// f.setBackground(Color.green); 이건 안됨 => 왜? JFrame은 진짜 그냥 판떼기라서
		f.getContentPane().setBackground(Color.green);

		// 물 흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// Font - 글자스타일 담당 부품, (글자체, 진함, 글자크기)
		Font font = new Font("궁서", 10, 50);

		// 버튼 넣는 객체
		JButton plus = new JButton();
		plus.setText("더하기");
		plus.setBackground(Color.yellow);
		plus.setForeground(Color.blue);
		plus.setFont(font);
		JButton minus = new JButton();
		minus.setText("빼기");
		minus.setBackground(Color.yellow);
		minus.setForeground(Color.blue);
		minus.setFont(font);

		// 글자 넣는 객체 JLabel
		JLabel l1 = new JLabel();
		l1.setText("숫자 1");
		l1.setForeground(Color.blue);
		JLabel l2 = new JLabel();
		l2.setText("숫자 2");
		l2.setForeground(Color.blue);

		// 글자 넣는 부품 JLabel
		JLabel top = new JLabel();
		// 이미지 넣는 부분, image 파일은 반드시 프로젝트 파일 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("계산기.jpg");
		top.setIcon(icon);
		
		JLabel under = new JLabel();
		under.setText("결과 들어가는 곳");
		under.setFont(font);

		// 입력하는 객체 JTextArea
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 입력칸 배경색
		t1.setForeground(Color.white); // 입력 글자색
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red); // 입력칸 배경색
		t2.setForeground(Color.white); // 입력 글자색

		// 프레임에 얹기
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(under);


		// 1. plus 버튼 클릭했을 때 액션 처리하겠다는 설정
		// 2. 어떤 부품이 할지를 램에다 만들어서 넣어주어야함.
		// 3. 그 부품안에 있는 함수(기능)을 사용해야 우리가 원하는 버튼 처리 기능을 사용할 수 있음..
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리할 내용을 써주면 됨.
				System.out.println("플러스 버튼을 눌렀군.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				// 데이터를 입력했는지 확인하는 방법 2가지
				// 1. s1.equals("")
				// 2. s1.length()
				

				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "숫자를 입력해주세요.");
				} else {
					int n1 = Integer.parseInt(s1),
						n2 = Integer.parseInt(s2),
						sum = n1 + n2;

					System.out.println("더한 값은 " + sum);
					// JOptionPane.showMessageDialog(under, "더한 값은" + sum);
					under.setText("더한 값은 " + sum);

					// 결과 출력하고 입력칸 비워주기
					t1.setText("");
					t2.setText("");
				}

			}
		});

		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리할 내용을 써주면 됨.
				System.out.println("마이너스 버튼을 눌렀군.");

				String s3 = t1.getText();
				String s4 = t2.getText();
				
				if(s3.length() < 1 || s4.length() < 1) {
					System.out.println("숫자를 입력해주세요.");
				} else {
					int n3 = Integer.parseInt(s3),
							n4 = Integer.parseInt(s4),
							sum2 = n3 - n4;

						System.out.println("뺀 값은 " + sum2);
						under.setText("뺀 값은 " + sum2);

						t1.setText("");
						t2.setText("");
				}

							}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x를 누르면 종료!
		// 이 설정이 없으면, 보이지만 않게 된 것임.

		// 위에서 설정한 거 다 보여줘 => 꼭 맨 끝 줄에 넣어주기
		f.setVisible(true);
	}

}
