package 배열;

import java.util.Arrays;

public class 뒤에서5등까지_sort_copyOfRange함께사용 {

	public static void main(String[] args) {
		// 정수로 이루어진 리스트 num_list가 주어집니다. 
		// num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		// 6 ≤ num_list의 길이 ≤ 30
		// 1 ≤ num_list의 원소 ≤ 100
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		// 1. 그냥 Arrays.sort를 사용하면 배열도 오름차순으로 정렬 가능.
		// 2. 그렇다면 그냥 정렬하고 5개까지만 잘라버릴까?
		
		Arrays.sort(num_list);
		
		int[] answer = Arrays.copyOfRange(num_list, 0, 5);
		
		System.out.println(Arrays.toString(answer));

		
	}

}
