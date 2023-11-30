package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String s2 = "Zbcdefg";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution4 {
	public String solution(String x) {
		char[] c = x.toCharArray();
		Arrays.sort(c);
		
		String s = new String(c);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		return sb.toString();
	}
}