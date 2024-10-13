package 문자열;

import java.util.Arrays;

public class x사이의갯수_split두번째인자까지 {

	public static void main(String[] args) {
		// 문자열 myString이 주어집니다. 
		// myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ myString의 길이 ≤ 100,000
		// myString은 알파벳 소문자로 이루어진 문자열입니다.
		
		String myString = "xabcxdefxghi";
		
		// 1. 문자 'x'를 기준으로 하는 split 메서드를 사용하면 될 듯
		// 2. 그 후 각각의 배열의 길이를 탐색해서 배열에 저장
		
		System.out.println(Arrays.toString(myString.split("x")));
		
		String[] result = myString.split("x", - 1);
		int[] answer = new int[result.length];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result[i].length();
		}
		
		System.out.println(Arrays.toString(answer));
		
		

	}

}
