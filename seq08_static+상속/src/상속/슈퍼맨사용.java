package 상속;

public class 슈퍼맨사용 {

	public static void main(String[] args) {
		슈퍼맨 s = new 슈퍼맨();
		// super를 넣으려고 했는데 super는 this와 마찬가지로
		// 이미 문법으로 예약되어있기 때문에 쓸 수 없음.
		s.age = 1000; // 사람 클래스
		s.speed = 1; // 남자 클래스
		s.power = 100; // 슈퍼맨 클래스
		
		s.걷다();
		s.먹다();
		s.우주를날다();
		s.빨리달리다();
	}

}
