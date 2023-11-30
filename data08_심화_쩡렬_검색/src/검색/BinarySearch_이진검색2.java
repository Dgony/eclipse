package 검색;

import java.util.Arrays;

public class BinarySearch_이진검색2 {

	public static void main(String[] args) {
		int[] num = {1, 4, 5, 2, 7, 8, 9, 6};
		int[] search = {1, 7, 6};
		// 조건 : 찾는 값은 무조건 목록 안에 존재함
		// 오름차순 정렬 후 위치를 찾아서 다음과 같이 프린트
		// "인덱스 - 인덱스 - 인덱스"
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		int s1 = Arrays.binarySearch(num, search[0]);
		int s2 = Arrays.binarySearch(num, search[1]);
		int s3 = Arrays.binarySearch(num, search[2]);
		System.out.println(s1 + " - " + s2 + " - " + s3);
		

	}

}
