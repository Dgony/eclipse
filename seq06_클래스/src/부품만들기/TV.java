package 부품만들기;

public class TV {
	// TV라는 부류의 공통적인 특징을 가지고 틀을 만들 예정
	// 속성 = 채널, 볼륨, 온오프 상태 등 ==> 이런 것들은 멤버 변수
	// 기능 = 채널 바꾸기, 유튜브 보기 ==> 예들은 멤버메서드
	
	public int ch;
	public int vol;
	public boolean onOff;
	// TV tv1 = new TV(); ==> 이 순간 채널, 볼륨, 온오프 상태가 tv1 주소에 저장됨.
	// 주소는 4, int는 4, boolean은 1 ==> 13byte의 공간을 잡아먹음
	
	public void 채널을바꾸다() {
		System.out.println("채널을 바꾸는 기능 처리");
	}
	public void 유튜브보다() {
		System.out.println("볼륨을 키워서 동영상을 보다.");
	}
}
