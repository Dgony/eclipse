package 반복문과랜덤;

import java.util.Random;

public class 랜덤으로로또만들기 {

	public static void main(String[] args) {
		Random r = new Random();
		// Random의 매개변수를 통해 랜덤에 일정한 규칙을 가지는 '시드값' 부여 가능
		
		int number = 0;
		for (int i = 0; i < 6; i++) {
			number = r.nextInt(35);
			System.out.println("랜덤 발생한 숫자는 " + number);
		}
		
		// 게임프로그램 등에서 랜덤하게 움직이게 만들게 하기 위해 사용하는 방법
		int start = 200;
		for (int i = 0; i < 100; i++) {
			number = start + r.nextInt(100);
			System.out.println("캐릭터가 " + number + "만큼 움직였습니다.");
		}
		

	}

}
