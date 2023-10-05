package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전 방문 수
		int count2 = 4; // 오후 방문 수

		int total1 = cal3.add(count1, count2);
		int total2 = cal3.minus(count1, count2);
		int total3 = cal3.mul(count1, price);
		int total4 = cal3.mul(count2, price);
		int total5 = cal3.add(total3, total4);
		int total6 = cal3.div(total5, total1);

		System.out.println("오늘 온 손님의 총 합은 " + total1 + "명 입니다.");
		System.out.println("손님 수 차이는 " + total2 + "명 입니다.");
		System.out.println("오전 결제금액은 " + total3 + "원 입니다.");
		System.out.println("오후 결제금액은 " + total4 + "원 입니다.");
		System.out.println("오늘 하루 총 결제금액은 " + total5 + "원 입니다.");
		System.out.println("1인당 결제금액은 " + total6 + "입니다.");
	}

}
