package 스레드;

import java.time.LocalTime;
import java.util.Timer;

public class Timer작동테스트 extends Timer작동{

	public static void main(String[] args) {
		Timer timer1 = new Timer();
		Timer작동 작동 = new Timer작동();

		System.out.println("5초 동안 게임을 할 수 있습니다.");
		timer1.schedule(작동, 5000);
		System.out.println("5초가 카운트 되는 중입니다.");
		
		LocalTime time = LocalTime.now();
		// 변수는 시간이 고정되기 떄문에 .now를 직접 반복문에 집어넣어야 함.
		
		for (int i = 0; i < 10; i++) {
			System.out.println(">>>>>>>>");
			System.out.println(LocalTime.now());
			System.out.println(LocalTime. now().getHour());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	
	}
	
}
