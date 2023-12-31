package 배열고급;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력배열반환_고정길이2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88};
		Solution2 s = new Solution2();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] n) {
		int[] answer = new int[3];
		// 배열은 홀수개만 들어온다
		// 중앙값의 위치는 ==> 배열의 갯수/2
		// 배열을 정렬 후
		Arrays.sort(n);
		
		// 중앙값을 구하고 ==> answer 배열의 첫번째 위치에 넣는다
		int median = n[n.length/2];
		answer[0] = median;

		// 중앙값에다 10을 더한 수 ==> answer 배열의 두번째 위치에 넣는다
		answer[1] = median + 10;
		
		// 중앙값에다 10을 뺀 수 ==> answer 배열의 세번째 위치에 넣는다.
		answer[2] = median - 10;
		
		// 배열에 하나로 묶어서 리턴
		return answer;
	}
}