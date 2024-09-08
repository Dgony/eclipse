package 배열;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		// 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
		// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		// 1 ≤ num_list의 길이 ≤ 1,000
		// 0 ≤ num_list의 원소 ≤ 1,000
		
		int[] num_list = {1, 0, 1, 1, 1, 3, 5};

		int[] answer = new int[num_list.length];
		// 꺼낼 때는 앞 0에서부터 꺼내줄 예정
		// 넣을 떄는 뒤(개수 - 1)부터 넣어줄 예정 => j
		int j = answer.length - 1;
		// {1,2,3} ==> length(3) - 1 ==> 2
		for (int i = 0; i < answer.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
