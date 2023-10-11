package 상속응용;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용넣기
		for (int i = 500; i >= 0; i--) {
			Date date = new Date();
			System.out.println("시각 >> " + date);
			try {
				Thread.sleep(1000); // 밀리세컨즈, 컴퓨터한테 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
