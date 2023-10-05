package 메서드기본;

public class 내_카페 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();

		int total = cal.add2();
		// 할인기간이면 계산된 금액에서 1000원을 빼주고 싶다.
		// 그럼 sum 값을 가져와야겠지? 그러려면 void
		// -> int 타입의 데이터를 return(반환) 함
		System.out.println(total - 1000);

		int total2 = cal.add3(3000, 5);
		System.out.println(total2);
		
		int total3 = cal.add4(10000);
		// 입력한 값 10000원에
		// 미수금 2000원을 더해서 리턴한 다음
		// 1000을 빼서 출력
		System.out.println(total - 1000);
	}

}
