package 문자열;

import java.util.Stack;

public class 문자열뒤의n글자 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 n이 매개변수로 주어질 떄,
		// my_string의 뒤의 n글자로 이루어진 문자열을 return하는
		// solution 함수를 작성해주세요.
		String my_string = "ProgrammerS123";
		int n = 11;
		
		String answer = "";
		String[] c = my_string.split("");
		Stack<String> stack = new Stack<String>();
		for (int i = c.length-n; i < c.length; i++) {
			stack.push(c[i]);
			answer += stack.pop();
			
		}
		System.out.println(answer);
	}

}
