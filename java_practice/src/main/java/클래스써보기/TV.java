package 클래스써보기;

public class TV {
	
	// 프로그램을 실행하지 않고 변수와 메서드만 담는 클래스는 main 메서드가 필요하지 않다.
	
	public int ch;
	public int vol;
	public boolean onOff; // boolean은 false로 초기화
	// 전역변수는 자동 초기화가 됨.
	// 참조형 변수는 null로 초기화
	
	public void 채널을바꾸다() {
		int change = 1;
		System.out.println(ch + change + "번호로 채널을 바꿨다.");
	}
	
	public void 유튜브보다() {
		System.out.println("볼륨을 " + vol + "만큼 키워서 유트브 봤다.");
	}


}
