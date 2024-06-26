package 생성자;

public class 생성자메서드부르는곳 {

	public static void main(String[] args) {
		// new를 통해 어떤 클래스를 객체 생성할 때 호출하게 되는 메서드.
		컴퓨터 computer1 = new 컴퓨터(1000, "샘숭", 20);
		컴퓨터 computer2 = new 컴퓨터(2000, "엘쥐", 30);
		
		System.out.println(computer1); // .toString 메서드 확인
		System.out.println(computer2); // .toString 메서드 확인
		
		
		// TV 부르기
		TV tv1 = new TV(15, 10, true);
		TV tv2 = new TV(25, 30, true);
		TV tv3 = new TV(35, 50, true);
		
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
		System.out.println("TV 클래스가 호출 된 횟수는 " + tv1.getCount());
		System.out.println("TV 클래스가 호출 된 횟수는 " + TV.count); // static은 인스턴스 호출 없이 사용 가능

	}

}
