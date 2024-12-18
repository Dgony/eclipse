package 배열;

import java.util.HashSet;

public class 글자지우기_HashSet {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 배열 indices가 주어질 때, 
		// my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ indices의 길이 < my_string의 길이 ≤ 100
		// my_string은 영소문자로만 이루어져 있습니다
		// 0 ≤ indices의 원소 < my_string의 길이
		// indices의 원소는 모두 서로 다릅니다.
		
		String my_string = "apporoograpemmemprs";
		int[] indicies = {1, 16, 6, 15, 0, 10, 11, 3};
		
		// 1. 해쉬셋을 만들고 indicies에 해당하지 않는 index의 경우만 
		//    반복문을 통해 결과 변수에 추가  
		
		String answer = "";
		
		HashSet<Integer> set = new HashSet();
		
		for (int i = 0; i < indicies.length; i++) {
			set.add(indicies[i]);
		}
		
		for (int i = 0; i < my_string.length(); i++) {
			answer += set.contains(i) ? "" : my_string.charAt(i);
		}
		
		System.out.println(answer);
		
		
	}

}
