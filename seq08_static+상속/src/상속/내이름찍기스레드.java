package 상속;

public class 내이름찍기스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("홍길동");
		}
	}
}
