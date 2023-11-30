package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기2 {

	public static void main(String[] args) {
		Solution02 s = new Solution02();
		int[] num_list = { 1, 2, 3, 4, 5, 33, 22, 55, 11 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution02 {
	public int[] solution(int[] num_list) {
		// 역순으로 정렬해보세요.(내림차순)
		// 오름차순으로 정렬하고 --> 거꾸로 집어넣기
		Arrays.sort(num_list);
		
		int[] answer = new int[num_list.length];
		// 거꾸로 집어넣기 위해서는
		// 끝에서부터 하나씩 위치값을 감소시키는 별도의 j변수 필요
		int j = num_list.length-1;
		for (int i = 0; i < answer.length; i++) {
			answer[j] = num_list[i];
			j--;
		}
		return answer;
	}
}