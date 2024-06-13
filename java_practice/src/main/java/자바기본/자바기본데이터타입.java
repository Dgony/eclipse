package 자바기본;

public class 자바기본데이터타입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수, 기본 int
		byte age = 100; // +-128
		short wallet = 20000; // +- 3만
		int money = 5000000; // +- 21억
		long space = 10000000000L; // +- 9백경
		// long으로 데이터 타입을 선언해도 L을 붙이지 않으먄 int 선언으로 인식함
		System.out.println(
				"내 나이는 " + age + "\n" +
				"내 지갑엔 " + wallet + "\n" +
				"내 계좌엔 " + money + "\n" + 
				"저 드넓은 우주는 " + space);
	
		// 실수, 기본 double
		float weight = 88.8f;
		// float은 f를 붙이지 않으면 오류가 발생함
		// 하지만 long처럼 f를 붙이지 않았다고 double 취급하지는 않음
		double height = 185.5;
		System.out.println(
				"내 키는 " + height + "\n" + 
				"내 몸무게는 " + weight);
		
		// 문자 
		char gender = '남';
		System.out.println("내 성별은 " + gender);
		
		// 논리
		boolean 참 = true;
		System.out.println("뉴스기사는 " + 참);
		
		// String
		// 기본 데이터 타입에 해당하지는 않지만, 너무 자주사용해서
		// String을 기본 데이터처럼 다루기 위한 클래스를 만들어놓음
		String name = "홍길동";
		System.out.println(name);

	}

}
