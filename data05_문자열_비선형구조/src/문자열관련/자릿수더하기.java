package 문자열관련;

import 배열기본.Print;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int num = 1234;
		int result = s.solution(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		int answer = 0;
		// 정수 n의 각 자릿값을 모두 더해서 출력
		String s = String.valueOf(n);
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
		
		return answer;
	}
}