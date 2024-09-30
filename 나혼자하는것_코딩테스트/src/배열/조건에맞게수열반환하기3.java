package 배열;

import java.util.Arrays;

public class 조건에맞게수열반환하기3 {

	public static void main(String[] args) {
		// 정수 배열 arr와 자연수 k가 주어집니다.
		// 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, k가 짝수라면 arr의 모든 원소에 k를 더합니다.
		// 이러한 변환을 마친 후의 arr를 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ arr의 길이 ≤ 1,000,000
		// 1 ≤ arr의 원소의 값 ≤ 100
		// 1 ≤ k ≤ 100
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		
		int[] answer = new int[arr.length];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = k % 2 == 1 ? arr[i] * k : arr[i] + k; 
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
