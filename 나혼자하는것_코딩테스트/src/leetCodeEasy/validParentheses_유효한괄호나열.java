package leetCodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses_유효한괄호나열 {

	public static void main(String[] args) {
		
		// 괄호로 이루어진 문자열이 주어졌을 때 유효한 경우인지 판단 true / false
		// 1. 열린 괄호는 같은 유형의 괄호로 닫아야 유효하다. 
		// 2. 열린 괄호는 올바른 순서대로 닫아야 유요하다. 
		// 3. 모든 닫힌 괄호에는 동일한 유형의 대응하는 열린 괄호가 있어야 유효하다.

		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "([])";
		
		// 음 key value로 묶고싶어지는 조합이다.  
		// 일단 문자열의 대응을 저장
		// 조건을 따지면 열린 괄호는 자신보다 큰 index를 가지는 닫힌 괄호를 가져야 하며
		// 닫힌 괄호는 자신보다 작은 index의 열린 괄호를 가져야 하고 
		// 이때 열린 괄호는 다른 유형의 괄호가 열리면 그 괄호가 닫힐 때까지 닫힌 괄호를 가질 수 없다.
		// 이는 반대의 경우도 마찬가지다.
		// 결국에 반복문을 써도 string의 길이만큼 하겠지 
		// 어떤 상태를 저장하고 해결되지 않으면 false를 반환해야 함
		// 상태를 저장하려면 map이 empty한지 확인해야겠지? 
		// 괄호는 무조건 열면 열리는 대로 열 수 있다.  
		// 하지만 닫히는 조건의 괄호가 다음과 같은 사항을 확인해야 함  
		// 열린 괄호가 앞쪽에 존재하는지 - map의 contains
		// 다른 괄호가 닫히기 전에 먼저 진입하지 않았는지 - 숫자 1차이가 아니면 return 맞으면 removce
		
		Stack<String> stack = new Stack<String>();
		boolean fact = true;
		
		for (int i = 0; i < s1.length(); i++) {
			switch (s1.charAt(i)) {
			case '(': stack.push("("); break;
			case '[': stack.push("["); break;
			case '{': stack.push("{"); break;
			case ')': if (stack.isEmpty() || !stack.pop().equals("(")) fact = false; break;
			case ']': if (stack.isEmpty() || !stack.pop().equals("[")) fact = false; break;
			case '}': if (stack.isEmpty() || !stack.pop().equals("{")) fact = false; break;
			}
			System.out.println(fact);
		}
		fact = true;
		System.out.println(fact);
		
		
		
		
	}

}
