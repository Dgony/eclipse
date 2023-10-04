package 부품만들기;

public class 전화기 {
	// 특징(속성)
	// 크기, 색, 회사, 가격, .....
	// 특징을 선택해서 사용할 예정
	// 특징을 부품으로 쓸 때는 변수로 만들어주면 됨. (멤버 변수)
	int price;
	String company;
	
	// 부품의 기능(function, 함수) ==> 메서드(방법)
	// 이것을 멤버함수(멤버메서드)
	// 다른 언어는 전부 함수인데, 자바를 만든 제임스 고슬링은 메서드라는 이름을 고집함.
	// public void 기능이름() {} 이런 형태로 기능을 만듦
	public void 카톡하다() {
		System.out.println("카톡을 하다.");
	}
	public void 인터넷하다() {
		System.out.println("인터넷을 하다.");
	}
}
