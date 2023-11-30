package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기_stack2 {

	public static void main(String[] args) {
		int[] n = {4, 3, 2, 1, 5};
		// 1. Stack을 이용하여 최대값을 제외한 값의 목록을
		//    오름차순으로 배열로 모아 프린트해보세요.
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.add(n[i]);
		}
		stack.pop();
		
		int[] asc = new int[stack.size()];
		for (int i = 0; i < asc.length; i++) {
			asc[i] = stack.get(i);
		}
		System.out.println(Arrays.toString(asc));
		
		// 2. 내림차순으로 배열로 모아 프린트해보세요.
		int[] des = new int[stack.size()];
		for (int i = 0; i < des.length; i++) {
			des[i] = stack.pop();
		}
		System.out.println(Arrays.toString(des));
		
	}

}
