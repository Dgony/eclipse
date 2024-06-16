package 자바기본;

public class 기본데이터_연산정리 {

	public static void main(String[] args) {
		// 1. 커피값 계산하기
		int price = 5000;
		int count = 5;
		int total = price + count;
		if (total > 20000) {
			System.out.println("할인해드릴게요");
		} else {
			System.out.println("할인 없어용~!");
		}
		
		// 2. 나이 계산하기
		int age = 100;
		int nextage = age + 1;
		if (nextage > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어용");
		}
		
		// 3. 생수값, 마스크값 계산하기
		int water = 1000;
		int water2 = 2;
		int mask = 2000;
		int mask2 = 3;
		int total2 = water * water2;
		int total3 = mask * mask2;
		System.out.println("생수 값은 " + total2);
		System.out.println("마스크 값은 " + total3);
		System.out.println("총 지불 금액은 " + (total2 + total3));
		
		// 4. '나는 짱'을 1000번 프린트
		String best = "나는 짱";
		for (int i = 0; i < 1000; i++) {
			System.out.println(best);
		}
		
		// 5. 점수 프린트
		int math = 50;
		int language = 75;
		int total4 = math + language;
		System.out.println(total4);

	}

}
