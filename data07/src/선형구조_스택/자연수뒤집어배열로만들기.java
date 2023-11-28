package 선형구조_스택;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		int n = 12345;
		
		// 1. 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는
		//    배열을 return하기, stack 이용하면 편함
		String s = n + "" ;
		String[] s2 = s.split("");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s2.length; i++) {
			stack.add(s2[i]);
		}
		Collections.reverse(stack);
		String[] s3 = new String[stack.size()];
		for (int i = 0; i < s3.length; i++) {
			s3[i] = stack.get(i);
		}
		System.out.println(Arrays.toString(s3));
		
	}

}
