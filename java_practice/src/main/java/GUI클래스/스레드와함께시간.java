package GUI클래스;

import java.time.LocalTime;

import javax.swing.JLabel;

import 스레드.동시배열스레드;

public class 스레드와함께시간 extends Thread{
	
	JLabel l2;
	동시배열스레드 name = new 동시배열스레드();
	
	public void run() {
		String[] arr1 = name.food;
		for (int i = 0; i < 15; i++) {
			l2.setText("시간     >>>     " + LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
