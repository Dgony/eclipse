package 배열;

import java.util.Arrays;

public class n개간격의원소들__Math_ceil없이올림하기 {

	public static void main(String[] args) {
		// 정수 리스트 num_list와 정수 n이 주어질 때, 
		// num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 
		// 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		// 5 ≤ num_list의 길이 ≤ 20
		// 1 ≤ num_list의 원소 ≤ 9
		// 1 ≤ n ≤ 4

		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;
		
		// 1. for문 idx와 n을 곱해서 반복
		
		int[] answer = new int[(num_list.length + n - 1) / n];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n * i > num_list.length ? 0 : num_list[n * i]; 
		}
		
		System.out.println(Arrays.toString(answer));
		
		// 오류
		// 만약 n을 곱한 값이 answer 보다 넘는 경우?
		// ==> answer 길이보다 긴 경우를 예외처리하는 식을 넣어야 함.  
		// 항상 오류가 생길 수 있는 가능성이 있는 부분을 파악해두는 것이 중요하다. 
		
	}

}
