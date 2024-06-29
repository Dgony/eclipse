package 스레드;

public class 동시스레드 {

	public static void main(String[] args) {
		동시배열스레드 array = new 동시배열스레드();
		동시시간스레드 time = new 동시시간스레드();
		동시카운터스레드 counter = new 동시카운터스레드();
		
			counter.start();
			array.start();
			time.start();
		
	}

}
