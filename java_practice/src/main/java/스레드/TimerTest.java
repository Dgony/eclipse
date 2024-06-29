package 스레드;

import java.util.TimerTask;

public class TimerTest extends TimerTask{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕히 가세요!");
		}
		
	}

	
	
}
