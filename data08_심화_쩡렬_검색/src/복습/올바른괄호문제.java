package 복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "()()";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public boolean solution(String s2) {
		// Stack에 String으로 받은 Character를 하나씩 넣을 예정
		// '('는 push!, ')'는 pop!
		// ==> 결과적으로 열고 닫고 괄호의 짝이 맞으면 Stack이 비워짐
		Stack<Character> stack = new Stack<Character>();
		boolean answer = false;
		try {
			for (int i = 0; i < s2.length(); i++) {
				// 꺼낸 문자가 '('인지 확인해야 함
				if (s2.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop();
				}
			} 
			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}
		
		return answer;
	}
}