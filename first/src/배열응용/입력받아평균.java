package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		String n = "";
		int[] num = new int[3]; // num = {0,0,0};
		for (int i = 0; i < 3; i++) {
			// 입력 5개 받아서 ==> 저장 ==> 꺼내서 누적연산
			n = JOptionPane.showInputDialog("숫자를 입력해주세요"); // "100" 
			// 입력값을 String으로 받아서 프로그램으로 안으로 가져오는 것 까지 해줌
			num[i] = Integer.parseInt(n); //
			// System.out.println(num[i]);
		}
		
		for (int x : num) {
			System.out.println(x);
		}
		
		// only 출력, 내용만 확인 가능
		System.out.println(Arrays.toString(num));
		
		int sum = 0;
		for (int x : num) {
			sum += x;
		}
		System.out.println(sum);
		System.out.println((double)sum / num.length);
	}

}
