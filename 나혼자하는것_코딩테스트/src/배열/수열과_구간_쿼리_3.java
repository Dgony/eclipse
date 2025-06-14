package 배열;

import java.util.Arrays;

public class 수열과_구간_쿼리_3 {

	public static void main(String[] args) {
		// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
		// 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
		// 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		// 제한사항
		// 1 ≤ arr의 길이 ≤ 1,000
		// 0 ≤ arr의 원소 ≤ 1,000,000
		// 1 ≤ queries의 길이 ≤ 1,000
		// 0 ≤ i < j < arr의 길이
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};

		// 1. queries 길이만큼 반복, queires를 바꾸지 않고 index값도 필요 없으니까 foreach 가자 
		// 2. 임시 변수를 하나 두고 저장해가면서 반복
		
		for (int[] is : queries) {
			int x = arr[is[0]];
			int y =  arr[is[1]];
			arr[is[0]] = y; 
			arr[is[1]] = x; 
			System.out.println(Arrays.toString(arr));
		}

	}

}
