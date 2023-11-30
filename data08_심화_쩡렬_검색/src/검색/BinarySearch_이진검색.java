package 검색;

import java.util.Arrays;

public class BinarySearch_이진검색 {

	public static void main(String[] args) {
		int[] num = {1, 4, 5, 2, 7, 8, 9, 6};
		
		// 정렬을 먼저 해야 함
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 5));
		System.out.println(Arrays.binarySearch(num, 8));
		System.out.println(Arrays.binarySearch(num, 10));
		System.out.println(Arrays.binarySearch(num, 1, 5, 1));

	}

}
