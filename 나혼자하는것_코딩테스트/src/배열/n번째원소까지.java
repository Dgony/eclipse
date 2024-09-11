package 배열;

import java.util.Arrays;

public class n번째원소까지 {

	public static void main(String[] args) {
		// 정수 리스트 num_list와 정수 n이 주어질 때, 
		// num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ num_list의 길이 ≤ 30
		// 1 ≤ num_list의 원소 ≤ 9
		// 1 ≤ n ≤ num_list의 길이 ___
		
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		// 1. 마찬가지로 Arrrays.copyOfRange를 사용하면 될 듯
		
		int[] answer = Arrays.copyOfRange(num_list, 0, n);
		
		System.out.println(Arrays.toString(answer));

	}

}
