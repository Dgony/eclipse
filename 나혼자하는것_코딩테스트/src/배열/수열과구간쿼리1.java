package 배열;

import java.util.Arrays;

public class 수열과구간쿼리1 {

	public static void main(String[] args) {
		// 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
		// 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
		// 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ arr의 길이 ≤ 1,000
		// 0 ≤ arr의 원소 ≤ 1,000,000
		// 1 ≤ queries의 길이 ≤ 1,000
		// 0 ≤ s ≤ e < arr의 길이
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
		
		// 1. 즉 qeuries의 길이만큼 반복할 때 
		//    그 원소에 해당하는 arr의 index를 +1 하면 되는 것  
		
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
				arr[j]++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
