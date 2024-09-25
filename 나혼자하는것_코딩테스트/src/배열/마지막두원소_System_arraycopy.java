package 배열;

import java.util.Arrays;

public class 마지막두원소_System_arraycopy {

	public static void main(String[] args) {
		// 정수 리스트 num_list가 주어질 때, 
		// 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면
		// 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ num_list의 길이 ≤ 10
		// 1 ≤ num_list의 원소 ≤ 9
		
		int[] num_list = {5, 2, 1, 7, 5};
		
		// 1. copyOfRange를 써야 할 듯 ==> 대체제로 System.arraycopy 를 쓰기로 함
		// 2. 미리 배열 하나를 만들고 그 배열에 복사
		
		int[] answer = new int[num_list.length + 1]; 
		
		System.arraycopy(num_list, 0, answer, 0, num_list.length);
		
		if (num_list[num_list.length - 2] < num_list[num_list.length - 1]) {
			answer[answer.length - 1] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
		} else {
			answer[answer.length - 1] = num_list[num_list.length - 1] * 2;
		}
		
		System.out.println(Arrays.toString(answer));
		

	}

}
