package 문자열;

import java.util.Arrays;

public class 문자열정렬하기1_정규표현식과아스키코드 {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어질 때,
		// my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
		
		String my_string = "p2o4i8gj2";
		
		// 1. 아스키코드 기준 '문자 0'이 '문자 a'보다 작음
		// 2. '문자 a'보다 작은 문자를 기준으로 판단
		// 3. 임의의 문자열에 저장했다가 다시 int 배열로 변환
		
		String answer = "";
		
		for (int i = 0; i < my_string.length(); i++) {
			answer = my_string.charAt(i) > 'a' ? answer : answer + my_string.charAt(i);
		}
		
		int[] result = new int[answer.length()];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = answer.charAt(i) - '0';
		}
		
		System.out.println(answer);
		System.out.println(Arrays.toString(result));
		
		// 정규표현식을 이용한 인상깊은 풀이  
		// my_string = my_string.replaceAll("[a-z]","");
		// 나는 반복문을 통해 문자열을 순회하면서 아스키코드값과 비교해 
		// 숫자 형태의 문자만을 포함하는 문자열 결과를 만들어 냈는데,  
		// 위의 풀이는 정규표현식의 문자 범위와 replaceAll 메서드를 활용해 숫자가 아닌 문자열은
		// 삭제해버리는 간단한 방법을 보여주었음.  

	}

}
