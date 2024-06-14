package 자바기본;

import javax.swing.JOptionPane;

public class 사칙연산입출력 {

	public static void main(String[] args) {
		// 1. 데이터 2개 입력
		String n1 = JOptionPane.showInputDialog("1번 숫자 입력");
		String n2 = JOptionPane.showInputDialog("2번 숫자 입력");
		
		// 2. 처리
		int number1 = Integer.parseInt(n1);
		int number2 = Integer.parseInt(n2); 
		
		int plus = number1 + number2;
		int minus = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;
		
		// 3. 출력
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiplication);
		System.out.println(division);
		for (int i = 0; i < 4; i++) {
			System.out.println(n2);
		}
	}

}
