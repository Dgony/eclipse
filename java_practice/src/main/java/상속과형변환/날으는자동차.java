package 상속과형변환;

public class 날으는자동차 extends 자동차{

	public 날으는자동차(String color) {
		super(color);
	}
	
	public void run() {
		System.out.println(color + " 날으는 자동차가 달리다.");
	}


}
