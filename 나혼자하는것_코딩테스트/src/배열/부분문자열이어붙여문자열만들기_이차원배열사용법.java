package 배열;

public class 부분문자열이어붙여문자열만들기_이차원배열사용법 {

	public static void main(String[] args) {
		// 길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다.\
		// parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
		// 각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ my_strings의 길이 = parts의 길이 ≤ 100
		// 1 ≤ my_strings의 원소의 길이 ≤ 100
		// parts[i]를 [s, e]라 할 때, 다음을 만족합니다.
			// 0 ≤ s ≤ e < my_strings[i]의 길이
		
		String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
		
		// 1. 지문을 읽었을 때 1차원적으로 생각나는건 substring을 사용하라는 의미인 것 같음
		
		String answer = "";
		
		// c타입 for문을 사용하는 경우
		for (int i = 0; i < parts.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
		
		System.out.println(answer);
		
	}

}
