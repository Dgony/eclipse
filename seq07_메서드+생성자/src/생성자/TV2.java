package 생성자;

public class TV2 {
	// 멤버 변수와 멤버 메서드는 동일함.
	public int ch;
	public int vol;
	public boolean onOff;
	
	public TV2(int c, boolean o, int v) {
		ch = c;
		onOff = o;
		vol = v;
	}
	
	public TV2(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
		// this. ==> 현재 클래스를 지정하는 말.
		// this.ch ==> 현재 클래스의 int ch 전역 변수를 지정함.
	}

	@Override
	public String toString() {
		return "TV2 [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}

	public void change() {
		System.out.println("채널을 바꾸다.");
	}
}
