package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
//	public void go() {
//		
//	}

	public JLabel count, image, day; // 라벨은 전역변수로 선언
	// 선언된 위치에 따라 사용 위치가 결정되기 때문.

	public 스레드그래픽() {
		setTitle("나의 pc방 모니터링 서비스");
		setSize(1200, 700);
		count = new JLabel("카운터 들어가는 자리");
		image = new JLabel("이미지 들어가는 자리");
		day = new JLabel("시각 들어가는 자리");
		
		Font font = new Font("맑은 고딕", Font.BOLD, 50);
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);

		카운터스레드 counter = new 카운터스레드();
		시각스레드 time = new 시각스레드();
		배열스레드 arr = new 배열스레드();
		counter.start();
		time.start();
		arr.start();		

		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		// 지금은 이렇게 썼지만, jframe은 기본 borderlayout 설정됨
		// 동 서 남 북 가운데만 넣을 수 있다.

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		스레드그래픽 name = new 스레드그래픽();
		// name.go();
	}

	// 전역변수를 사용하기 위해 클래스 안에 클래스를 끼워넣을 수 있다.
	// 잘 쓰진 않지만 클래스 안에 끼워넣은 클래스를 안쪽클래스(inner클래스)라고 한다.
	public class 카운터스레드 extends Thread {
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 집어넣기
			for (int i = 500; i >= 0; i--) {
				count.setText("카운터 >> " + i);
				if (i <= 450) {
					JOptionPane.showMessageDialog(null, "카운트가 완료되었습니다!");
				}
				try {
					Thread.sleep(1000); // 밀리세컨드, 컴퓨터에겐 1초
				} catch (InterruptedException e) { // 중단을 실행하는 명령어
					// TODO Auto-generated catch block
					e.printStackTrace(); // 어떤 에러인지 말해주는 명령어
				}

				// 외부의 자원(특히 cpu)와 연결하는
				// 아주 위험한 순간이 발생하기 때문에
				// 이런 순간은 try-catch문으로 감싸주기
			}
		}
	}

	public class 배열스레드 extends Thread {
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용 집어넣기
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				i = i == 4 ? -1 : i;
				try {
					Thread.sleep(5000); // 밀리세컨드, 컴퓨터에겐 5초
				} catch (InterruptedException e) { // 중단을 실행하는 명령어
					// TODO Auto-generated catch block
					e.printStackTrace(); // 어떤 에러인지 말해주는 명령어
				}

				// 외부의 자원(특히 cpu)와 연결하는
				// 아주 위험한 순간이 발생하기 때문에
				// 이런 순간은 try-catch문으로 감싸주기
			}
		}
	}

	public class 시각스레드 extends Thread {
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용넣기
			for (int i = 500; i >= 0; i--) {
				Date date = new Date();
				day.setText("시각 >> " + date);
				try {
					Thread.sleep(1000); // 밀리세컨즈, 컴퓨터한테 1초
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
