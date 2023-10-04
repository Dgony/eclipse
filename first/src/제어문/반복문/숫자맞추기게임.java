package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99) + 1;
		
		int count = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력해주세요.");
			
			// 입력값는 데이터 값을 동일하게 만들어주기 위한 작업
			int data2 = Integer.parseInt(data);
			
			count++;
			
			if (target == data2) {				
				System.out.println("정답입니다!");
				System.out.println("전체 시도 횟수 >> " + count + "번");
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else {
				if(data2 < target) {
					System.out.println("정답이 아닙니다, 정답 보다 작은 수 입니다.");
				} else {
					System.out.println("정답이 아닙니다, 정답 보다 큰 수 입니다.");
				}
			} 
		}
		
		
	}

}
