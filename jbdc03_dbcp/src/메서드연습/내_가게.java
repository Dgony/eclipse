package 메서드연습;

public class 내_가게 {

	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeCount = 15;
		
		// 커피 총 계산가격이 5만원 이상이면
		// 5000원을 할인해주려고 한다.
		계산기 cal = new 계산기();
		
		int coffee =  cal.mul(coffeePrice, coffeCount);
		coffee -= coffee >= 50000 ? 5000 : 0;
		System.out.println("커피 가격은 " + coffee + "원이다.");
		
		System.out.println(cal.arr1()[0] += 100);
		
		MemberVO result3 = cal.get2("win2", "1234", "win2", "0101");
		result3.setPw("1111");
		
		System.out.println(cal.get4("홍길동", 100) + "입니다. 환영해주세요."); 
	}

}
