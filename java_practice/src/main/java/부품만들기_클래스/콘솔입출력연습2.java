package 부품만들기_클래스;

import javax.swing.JOptionPane;

public class 콘솔입출력연습2 {

	public static void main(String[] args) {
		// BMI 지수 = 몸무게(kg) / (신장(m) * 신장(m));
		double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력해주세요."));
		double height = Double.parseDouble(JOptionPane.showInputDialog("키를 입력해주세요."));
		
		double BMI = weight / (Math.pow(height*0.01, 2));
		// double BMI = weight / ((height*0.01)*(height*0.01));
		
		System.out.println("BMI 지수는 " + BMI);
		
		
		// 포인트 누적 문제
		// 누적 3000, 추가 30.33
		int point1 = Integer.parseInt(JOptionPane.showInputDialog("누적 포인트를 입력해주세요."));
		double point2 = Double.parseDouble(JOptionPane.showInputDialog("추가 포인트를 입력해주세요."));
		
		double result = point1 + point2;
		
		System.out.println("최종 포인트는 " + result);
		
	}

}
