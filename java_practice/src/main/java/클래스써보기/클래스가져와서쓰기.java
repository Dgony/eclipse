package 클래스써보기;

public class 클래스가져와서쓰기 {

	public static void main(String[] args) {
		// 프로그램을 실행하기 위한 실행 클래스는 main 메서드가 있어야 한다.
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		tv1.ch = 20;
		tv1.vol = 30;
		tv2.ch = 40;
		tv2.vol = 50;
		
		tv1.채널을바꾸다();
		tv1.유튜브보다();
		tv2.채널을바꾸다();
		tv2.유튜브보다();
		
		계산기 cal = new 계산기();
		
		cal.x = 100;
		cal.y = 20;
		
		System.out.println(cal.plus()); // 매개변수 없이 메서드로만 이루어진 경우
		System.out.println(cal.minus());
		System.out.println(cal.multiplication());
		System.out.println(cal.divsion());
		
		System.out.println(cal.add(1, 1)); // 매개변수가 있는 경우
		System.out.println(cal.add(1, 1.0));
		System.out.println(cal.add(1.1, 1.1));
		System.out.println(cal.add("1", 1));
		

	}

}
