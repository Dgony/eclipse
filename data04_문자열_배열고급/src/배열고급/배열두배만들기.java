package 배열고급;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 100, -99, 1, 2, 3 };
		Solution7 s = new Solution7();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution7 {
	public int[] solution(int[] n) {
		for (int i = 0; i < n.length; i++) {
			n[i] = n[i]*2;
		}
		return n;
	}
}