package 생성자;

import javax.swing.JFrame;

import 부품만들기.TV;

public class 생성자_예제 {

	public static void main(String[] args) {
		JFrame f1 = new JFrame();
		// JFrame이라는 클래스 뿐만 아니라 같은 이름의 메소드도 가져오는 명령어
		f1.setTitle("나는 제목이야");
		
		JFrame f2 = new JFrame("나도 제목이야.");
		
		TV name = new TV();

		f1.setVisible(true);
		f2.setVisible(true);
	}

}
