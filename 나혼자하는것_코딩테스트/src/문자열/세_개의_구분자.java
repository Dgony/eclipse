package 문자열;

import java.util.Arrays;

public class 세_개의_구분자 {

	public static void main(String[] args) {
		// 임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.
		// 예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 ["onlettu", "etom", "to"] 가 됩니다.
		// 문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		// 단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.
		// 제한사항
		// 1 ≤ myStr의 길이 ≤ 1,000,000
		// myStr은 알파벳 소문자로 이루어진 문자열 입니다.
		
		String myStr = "baconlettucetomato";
		
		// 1. a, b, c를 빈 문자열로 나누고, 
		// 2. split 해볼까?  

		myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
		
		System.out.println(Arrays.toString(myStr.trim().split(" +")));
		

	}

}
