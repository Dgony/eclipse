package 스레드;

public class 천증감스레드 {

	public static void main(String[] args) {
		// 1 ~ 1000까지 증가하면서 찍는 스레드
		천증가스레드 ascend = new 천증가스레드();
		// 1000 ~ 1까지 감소하면서 찍는 스레드
		천감소스레드 descend = new 천감소스레드();
		
		ascend.start();
		descend.start();
		// 분명 만들어둔 스레드의 메서드는 run인데
		// start 메서드를 사용해야 스레드가 진행되는 걸 볼 수 있다.
		

	}

}
