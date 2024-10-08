package 문자열;

import java.util.Arrays;

public class 공백으로구분하기_split_정규표현식공백 {

	public static void main(String[] args) {
		// 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
		// my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		// my_string은 영소문자와 공백으로만 이루어져 있습니다.
		// 1 ≤ my_string의 길이 ≤ 1,000
		// my_string의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.
		
		String my_string = "i love you";
		
		// 1. 문자열을 c타입 for문을 이용해 전체 확인하면서 공백을 만나면 새로 만든 배열에 집어넣기
		
		System.out.println(Arrays.toString(my_string.split(" ")));
		
		// 2. 간단한 메서드를 발견해서 split을 사용하게 됨.

	}

}
