package 스레드;

public class 동시카운터스레드 extends Thread {
	
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("카운터 : " + (i+1)); 
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
