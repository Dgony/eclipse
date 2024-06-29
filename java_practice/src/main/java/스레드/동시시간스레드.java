package 스레드;

import java.time.LocalTime;

public class 동시시간스레드 extends Thread{
	
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
