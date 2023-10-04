package 제어문.반복문;

public class 반목문확인1 {

	public static void main(String[] args) {
		String star = "";
		for (int i = 0; i <= 10; i++) {
			star += "*";
		}
		System.out.println(star);
		
		String coffee = "";
		for (int i = 0; i < 6; i++) {
			coffee += "커피*";
		}
		System.out.println(coffee);
		
		String milk = "";
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}

		String jjang = "";
		for (int i = 1; i < 4; i++) {
			System.out.println();
			System.out.print(i + " : 짱!");
			// System.exit(0); => 여기서 프로그램 완전 종료 
		}
		
		System.out.println(milk);
		System.out.println(jjang);

	}

}
