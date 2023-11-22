package 배열메서드입출력;

import java.util.Arrays;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99};
		// 1. 배열의 평균을 구해서 프린트
		int avr = 0;
		for (int x : n) {
			avr += x;
		}
		int result = avr/n.length;
		System.out.println("배열의 평균값은 " + result);
		
		// 2. 배열의 최소값을 3개를 찾아서 더해서 프린트
		Arrays.sort(n);
		int result2 = n[0] + n[1] + n[2];
		System.out.println("배열 최소값 3개를 더한 값은 " + result2);
		
		// 3. 배열의 중앙값을 구해서 곱해서 프린트
		//    홀수인 경우) 중앙값에 10을 곱해서 프린트
        //	  짝수인 경우) 중앙값들을 곱해서 프린트
		int result3 = 0;
		if (n.length%2 == 0) {
			result3 = n[n.length/2] * n[n.length/2 - 1];
		} else {
			result3 = n[n.length/2] * 10;
		}
		System.out.println("중앙값은 " + result3);
		
		
		
	
	}
}