package 배열;

import java.util.Arrays;

public class 순서바꾸기_idx나머지값으로배열순회 {

	public static void main(String[] args) {
		// 정수 리스트 num_list와 정수 n이 주어질 때, 
		// num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 
		// n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ num_list의 길이 ≤ 30
		// 1 ≤ num_list의 원소 ≤ 9
		// 1 ≤ n ≤ num_list의 길이
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		// 1. 반복문과 n을 기준으로 새로운 배열에 집어넣으면 될 듯
		// 2. 만약 n 값이 num_list의 길이를 초과하면 0을로 설정해 다시 더하는 방식?
		
		int[] answer = new int[num_list.length];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[(n + i) % num_list.length];
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
