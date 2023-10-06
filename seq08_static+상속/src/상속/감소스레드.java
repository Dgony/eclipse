package 상속;

public class 감소스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 5000; i > 0; i--) {
			System.out.println(i);
		}
	}
}
