package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 수박수박수박수 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int n = 3;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution7 {
	public String solution(int n) {
        String answer = "";
        char q = '수';
        char w = '박';
        for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += q;
			} else {
				answer += w;
			}
		}
        return answer;
    }
}