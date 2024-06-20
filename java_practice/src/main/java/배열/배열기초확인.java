package 배열;

import java.util.Arrays;

public class 배열기초확인 {

	public static void main(String[] args) {
		// 1. int 크기 5인 배열
		int[] arr1 = new int[5];
		
		// 2. 배열의 크기를 프린트.
		System.out.println(arr1.length);
		
		// 3. 배열의 첫번째 위치에 100을 넣어서, 프린트
		arr1[0] = 100;
		System.out.println(Arrays.toString(arr1));
		
		// 4. 배열의 마지막 위치에 500을 넣어서, 프린트
		arr1[arr1.length-1] = 500;
		System.out.println(Arrays.toString(arr1));
		
		// 5. 배열의 세번째 위치에 200을 넣어서, 프린트
		arr1[2] = 200;
		System.out.println(Arrays.toString(arr1));
		
		// 6. 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + 1 + "번 인덱스 : " + arr1[i]);
		}
	}

}
