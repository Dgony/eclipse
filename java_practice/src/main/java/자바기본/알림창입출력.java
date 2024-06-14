package 자바기본;

import javax.swing.JOptionPane;

public class 알림창입출력 {

	public static void main(String[] args) {
		// 망치.망치질하다();
		// JOptionPane.showInputDialog(); == 알림창.알림창으로 입력받기
		// JOptionPane.showMessageDialog(); == 알림창.알림창만 띄우기
		String name =JOptionPane.showInputDialog("이름을 입력해주세요");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요.");
		
		// 당신은 몇시에 일어나나요?
		String wake = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
		JOptionPane.showMessageDialog(null, "당신은 " + wake + "에 일어나시는군요!");
		
		// joption도 입력창이기 떄문에 당연히 입력받는 값은 문자로 취급됨
		// 숫자로 입력해도 문자로 취급되기 떄문에, 연산같은 걸 하기 위해선 새 변수에 타입을 바꿔넣어야 함
		// 정수.분석해서정수로 바꿔줘(string);
		int wake2 = Integer.parseInt(wake);
		
		int result = wake2 + 1;
		System.out.println("하루 일과는 " + result + "시에 시작하자.");
	}

}
