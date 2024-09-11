package 배열;

import java.util.Arrays;

public class n번째원소부터_Arrays_copyOfRange사용법 {

	public static void main(String[] args) {
		// 정수 리스트 num_list와 정수 n이 주어질 때, 
		// n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ num_list의 길이 ≤ 30
		// 1 ≤ num_list의 원소 ≤ 9
		// 1 ≤ n ≤ num_list의 길이
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2;
		
		// 1. 반복문의 i를 n값과 같도록 설정하고 마지막 원소까지 탐색
		// 2. 미리 그 길이에 해당하는 배열을 만들 필요성도 있어보임.
		
		// num_list의 n번째 원소부터 마지막 원소까지 담을 수 있는 길이의 배열 생성
		int[] answer = new int[num_list.length - n + 1]; 
		
		// num_list의 n번째 원소부터 마지막 원소까지 탐색해 answer에 집언허는 반복문
		for (int i = 0; i < answer.length; i++, n++) {
			answer[i] = num_list[n-1];
		}
		
		// Arrays.copyOfRange(배열, 시작 index, 마지막 index) - 시작 index 이후부터 마지막 index까지 복사하는 방법
		// int[] answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
		
		System.out.println(Arrays.toString(answer));



	}

}
