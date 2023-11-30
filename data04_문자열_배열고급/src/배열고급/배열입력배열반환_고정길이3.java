package 배열고급;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력배열반환_고정길이3 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88};
		Solution3 s = new Solution3();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] n) {
		// 정렬을 한 이후에 모든 값에 100을 곱해서 리턴!
		int[] answer = new int[n.length];
		Arrays.sort(n);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i] * 100;
		}
		return answer;
	}
}