package 상속응용;

public class 스레드프로그래밍1 {

	public static void main(String[] args) {
		카운터스레드 counter = new 카운터스레드();
		시각스레드 time = new 시각스레드();
		배열스레드 arr = new 배열스레드();
		counter.start();
		time.start();
		arr.start();
		
		// 현재 스레드프로그래밍1 만 켜져 있을 때 돌아가는 스레드의 갯수는?
		// ==> 4개 - 카운터,시각,배열 + main
	}

}
