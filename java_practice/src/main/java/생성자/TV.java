package 생성자;

public class TV {
	
	int channel;
	int volume;
	boolean onOff;
	static int count; // 클래스에 속하는 변수
	
	public TV(int channel, int volume, boolean onOff) {
		count++; // 정적 변수
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
		
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}
	
	

}
