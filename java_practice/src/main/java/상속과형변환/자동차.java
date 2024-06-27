package 상속과형변환;

public class 자동차 {
	
	String color;
	
	public 자동차(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println(color + " 자동차가 달리다.");
	}

}
