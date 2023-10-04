package 부품만들기;

public class 전화기 {
	public int size; // 기본형 변수, 전역변수
	// 전역 변수는 자동초기화, 0이 들어가 있음.
	public String speaker; // 참조형 변수, 전역변수
	// 전역 변수는 자동초기화, null이 들어가 있음.
	
	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷하다.");
	}

	@Override
	public String toString() {
		return "전화기 사이즈는 " + size + "이고, 회사는 " + speaker;
	}
}
