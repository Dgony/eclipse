package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result1 = cal2.add(1, 2);
		double result2 = cal2.add(300, 22.2);
		System.out.println(result1);
		System.out.println(result2);

		double result3 = cal2.add(100, 200) + cal2.add(100, 22.2);
		System.out.println(result3);

		int[] result4 = cal2.add5();
		System.out.println(result4[0] + 100);

		Random r = new Random();
		int x = r.nextInt();
		double y = r.nextInt(100);
		// 얘기 돠는 이유 ==> double이 8byte라서 nextInt가 차지하는 4byte값이 충분히 들어가서
	}

}
