package 자바기본;

import javax.swing.JOptionPane;

public class 입력값데이터타입 {

	public static void main(String[] args) {
		// 두 수를 입력받고 숫자루 바꾼 다음 더해서 출력해주세요
		// 1. 입력
		String num1 = JOptionPane.showInputDialog("1번 입력값을 입력해주세요.");
		String num2 = JOptionPane.showInputDialog("2번 입력값을 입력해주세요.");
		
		// 2. 처리 
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		int result = num11 + num22;
		
		// 3. 출력
		System.out.println("두 수를 더한 결과는 " + result);
		
		
		// 이름 김길동, 나이 100, 소속 멀티
		String name = JOptionPane.showInputDialog("당신의 이름은 무엇인가요?");
		String age = JOptionPane.showInputDialog("당신의 나이는 몇살인가요?");
		int age2 = Integer.parseInt(age);
		String in = JOptionPane.showInputDialog("당신의 소속은?");
		
		System.out.println("이름은 " + name + ", 나이는 " + age2 + ", 소속은 " + in);

	}

}
