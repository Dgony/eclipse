package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대최소 {

	public static void main(String[] args) {
		// 10개의 데이터를 입력 받아서 최대값, 최소값을 찾아보세요
		// 배열, 반복문, 배열정렬, 위치값(인덱스)를 이용해서 최대ㅡ 최소를 찾아보세요.
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
	}

}

