package 스레드;

import java.time.LocalTime;
import java.util.Timer;

public class TimeTestUser {

	public static void main(String[] args) {
		// 10초를 카운트, 카운트가 끝나면 안녕하세요 10번 프린트
		
		TimerTest test = new TimerTest(); // 미리 만들어 둔 task 클래스로 만든 객체
		Timer user = new Timer(); // 시간 관련 계획을 만들기 위함
		
		user.schedule(test, 10000); // 10초가 지난 후 task 수행
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + "초 경과...");
			System.out.println(LocalTime.now().getSecond());
			try {
				Thread.sleep(1000); // 1초 동안 thread가 작동하지 않음
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		

	}

}
