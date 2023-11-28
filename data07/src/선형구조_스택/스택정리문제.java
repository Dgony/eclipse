package 선형구조_스택;

import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class 스택정리문제 {

	public static void main(String[] args) {
		// Stack 활용해서 풀어보기
		String[] food = {"apple", "apple", "banana",
				"banana", "melon", "melon", "berry"};
		
		// 1. 위 음식 목록의 음식 종류를 프린트
		Stack<String> stack = new Stack<String>();
		stack.push(food[0]);
		Stack<String> stack2 = new Stack<String>();
		for (int i = 0; i < food.length; i++) {
			if (stack.peek() != food[i]) {
				stack.push(food[i]);
			} else {
				stack2.push(food[i]);
			}
		}
		System.out.println("음식 종류는 >> " + stack);
		
		// 2. 중복된 목록 프린트 ==> 몇번 중복되었는지 체크하지 않음.
		System.out.println("중복된 음식 종류는 >> " + stack2);

	}

}
