package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 로또문제 {

	public static void main(String[] args) {
		// 랜덤하게 아무거나 만들어서 자동을 배열에 여러개 넣어보자
		Random r = new Random(); // 여기 안에다 랜덤 숫자 한도 조절 가능
		int[] arr = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			arr[i] = r.nextInt(100);
		}
		
		// System.out.println(Arrays.toString(arr));
		
		// for 문 이용해서 arr의 내용을 더해서 평균을 구해보세요;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println((double)sum / arr.length);
	}

}
