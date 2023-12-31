package 메서드연습;

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
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		Font font = new Font("맑은 고딕", 1, 50);
		ImageIcon icon1 = new ImageIcon("lock-7209995_1280.png");
		ImageIcon icon2 = new ImageIcon("로그인.png");
		ImageIcon icon3 = new ImageIcon("로구인실패.png");

		JFrame f = new JFrame();
		f.setSize(650, 1050);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.GRAY);

		// 라벨 3개, 텍스트필드2대, 버튼 2개
		JLabel top = new JLabel();
		top.setIcon(icon1);

		JLabel id1 = new JLabel();
		id1.setText("아이디 : ");
		id1.setFont(font);
		JLabel pw1 = new JLabel();
		pw1.setText("비밀번호 : ");
		pw1.setFont(font);

		JTextField id2 = new JTextField(10);
		id2.setFont(font);
		id2.setBackground(Color.pink);
		id2.setForeground(Color.blue);

		JTextField pw2 = new JTextField(10);
		pw2.setFont(font);
		pw2.setBackground(Color.pink);
		pw2.setForeground(Color.blue);

		JButton login = new JButton();
		login.setIcon(icon2);
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// login 버튼을 눌렀을 때 실행할 내용을 넣어주세요.
				// 꼬오오옥 버튼 하나당 함수 하나로 매칭!!
				System.out.println("로그인 버튼 클릭함");
				// 1. id2, pw2에서 입력한 데이터를 가지고 온다.
				// 2. id2의 값이 root인지, pw2의 값이 1234인지 확인
				// 둘 다 맞으면 '맞아요!' 출력, 둘 중 하나라도 틀리면 '틀려요!' 출력
				// 정식 코드는 아닌데 주석에 이렇게 가짜로 하겠다고 써 넣은 것을
				// 의사코드(psuedo코드) 라고 부른다.
				String id3 = id2.getText();
				String pw3 = pw2.getText();

				if (id3.equals("root") && pw3.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공, 일기장이 오픈됩니다.");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
					f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패, 다시 입력해주세요.");
				}
			}
		});

		JButton reset = new JButton();
		reset.setIcon(icon3);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset 버튼을 눌렀을 때 처리하고 싶은 내용
				System.out.println("지우기 버튼 클릭함");
				// 1. id2, pw2의 내용을 지우자.
				id2.setText("");
				pw2.setText("");
			}
		});

		// 얹는 부분
		f.add(top);
		f.add(id1);
		f.add(id2);
		f.add(pw1);
		f.add(pw2);
		f.add(login);
		f.add(reset);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); // void
	}

}
