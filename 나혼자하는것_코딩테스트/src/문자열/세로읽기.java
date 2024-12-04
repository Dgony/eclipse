package 문자열;

public class 세로읽기 {

	public static void main(String[] args) {
		// 문자열 my_string과 두 정수 m, c가 주어집니다. 
		// my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.
		// my_string은 영소문자로 이루어져 있습니다.
		// 1 ≤ m ≤ my_string의 길이 ≤ 1,000
		// m은 my_string 길이의 약수로만 주어집니다.
		// 1 ≤ c ≤ m
		
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		
		// 1. 반복문으로 m 누적 시키면서 c위치 찾기
		// 2. 결과 string 변수에 누적  
		
		String answer = "";
		
		for (int i = 0; i < my_string.length() / m ; i++) {
			answer += my_string.charAt(c - 1);
			c += m;
		}
		
		System.out.println(answer);

	}

}
