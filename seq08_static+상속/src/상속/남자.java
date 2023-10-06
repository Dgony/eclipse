package 상속;

public class 남자 extends 사람 {
	// 사람 클래스를 확장해서 남자 클래스를 만들겠다.
	
	// 몇 개의 멤버변수와 멤버서드를 가지고 태아닜는가?
	// 2개, 3개 ===> 총 5개를 가지고 태어남.
	
	int speed;
	
	public void 빨리달리다() {
		System.out.println("매우 빨리 달리다.");
	}
}
