package 메서드기본;

public class 내카페4 {

	public static void main(String[] args) {
		int c1 = 2000;
		int c2 = 5;
		int m1 = 3000;
		int m2 = 2;		
		
		계산기4 cal4 = new 계산기4();
		
		int 커피가격 = cal4.sum(c2, c1);
		System.out.println("커피 가격은 " + 커피가격 + "원 입니다.");
		
		int 밀크티가격 = cal4.sum(m2, m1);
		System.out.println("밀크티 가격은 " + 밀크티가격 + "원 입니다.");		
		
		int total = cal4.div(커피가격 + 밀크티가격, c2 + m2);
		System.out.println("1인당 결제할 금액은 " + total + "원 입니다.");
	}

}
