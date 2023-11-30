package 정렬;

import java.util.Arrays;

public class 최댓값최솟값 {

	public static void main(String[] args) {
		Solution0 s = new Solution0();
		String s2 = "1 2 3 4";
		String result = s.min(s2);
		String result2 = s.max(s2);
		System.out.println(result);
		System.out.println(result2);
	}
}

class Solution0 {
	public String min(String s2) {
		String[] s = s2.split(" ");
		Arrays.sort(s);
		String answer = s[0];
		return answer;
	}
	
	public String max(String s2) {
		String[] s = s2.split(" ");
		Arrays.sort(s);
		String answer = s[s.length-1];
		return answer;
	}
	
}