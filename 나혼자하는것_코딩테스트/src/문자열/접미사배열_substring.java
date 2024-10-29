package 문자열;

import java.util.Arrays;

public class 접미사배열_substring {

	public static void main(String[] args) {
		// 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
		// 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		// 문자열 my_string이 매개변수로 주어질 때, 
		// my_string의 모든 접미사를 사전순으로 정렬한 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		// my_string은 알파벳 소문자로만 이루어져 있습니다.
		// 1 ≤ my_string의 길이 ≤ 100
		
		String my_string = "programmers";
		
		// 1. 정렬 자체는 sort를 사용하면 될 듯?
		// 2. 접미사의 갯수는 문자열길이 - 1
		// 3. 반복문을 통해 idx 1 부터 추가한 뒤 정렬하는 결과?
		
		String[] answer = new String[my_string.length()];

		for (int i =0; i < answer.length; i++) {
			answer[i] = my_string.substring(i, my_string.length());
		}
		
		
		System.out.println(Arrays.toString(answer));
		



	}

}
