package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String my_string = "hello";
		int n = 3;
		String result = s.solution(my_string, n);
		System.out.println(result);
	}
}

class Solution9 {
	public String solution(String my_string, int n) {
		String answer = "";
		int x = 0;
		while(x != my_string.length()) {
			for (int i = 0; i < n; i++) {
				answer += my_string.charAt(x);
			}
			x++;
		}
        
        
        return answer;
    }
}