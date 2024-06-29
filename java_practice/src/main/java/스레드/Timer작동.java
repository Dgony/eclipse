package 스레드;

import java.util.TimerTask;

public class Timer작동 extends TimerTask{

	@Override
	public void run() { // TimerTask 클래스가 서브클래스에서 반드시 정의하도록 설정한 메서드
		// 설정된 시간이 지나면 어떤 동작을 할지 run() 에 설정하면 된다.  
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Timer task 진행중....");
		}
		
		System.out.println("시간이 종료되었습니다.");
	}

	
	
}
