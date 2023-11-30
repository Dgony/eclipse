package 선형구조_스택;

import java.util.Stack;

public class 백준스택문제 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.empty() ? 1 : 0);
		
		try {
			stack.pop();
			stack.pop();
			stack.pop();
		} catch (Exception e) {
			System.out.println("-1");
		}
		String s = "홍길동";
		System.out.println(s.length());

	}

}
