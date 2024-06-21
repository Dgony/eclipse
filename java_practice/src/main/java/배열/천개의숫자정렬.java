package 배열;

import java.util.Arrays;
import java.util.Random;

public class 천개의숫자정렬 {

	public static void main(String[] args) {
		// 천개의 숫자를 오름차순 정렬하는 방법
		Random r = new Random();
		int[] num = new int[1000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num); // 배열을 오름차순으로 정렬해주는 메서드
		// 파괴함수로, num을 바꿔버림
		// 비파괴함수였다면 새 변수를 만들어야 했을 것이고, num이 바뀌지 않을 것이다.
		
		System.out.println(Arrays.toString(num));
		System.out.println("num의 가장 작은 숫자는 " + num[0]);
		System.out.println("num의 가장 큰 숫자는 " + num[num.length-1]);
	}

}
