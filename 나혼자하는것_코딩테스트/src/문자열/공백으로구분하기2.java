package 문자열;

import java.util.Arrays;

public class 공백으로구분하기2 {

	public static void main(String[] args) {
		// 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, 
		// my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		// my_string은 영소문자와 공백으로만 이루어져 있습니다.
		// 1 ≤ my_string의 길이 ≤ 1,000
		// my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
		// my_string에는 단어가 하나 이상 존재합니다.
		
		String my_string = " i    love  you";
		
		// 1. 공백이 한 개 이상이기 떄문에 split 메서드는 사용 불가능.
		//    그럼 공백을 어떻게 줄여야 하지?
		// 2. 반복문을 쓴다 + 공백이 아닌 문자를 만나면 공백인 문자를 만날 때까지의 문자를 배열에 추가
		
		System.out.println(Arrays.toString(my_string.split("\\s+")));

	}

}
