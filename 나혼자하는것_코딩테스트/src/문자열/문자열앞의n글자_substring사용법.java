package 문자열;

public class 문자열앞의n글자_substring사용법 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
		// my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		// my_string은 숫자와 알파벳으로 이루어져 있습니다.
		// 1 ≤ my_string의 길이 ≤ 1,000
		// 1 ≤ n ≤ my_string의 길이
		
		String my_string = "ProgrammerS123";
		int n = 11;
		
		String answer = "";
		answer = my_string.substring(0, n);
		
		System.out.println(answer);

	}

}
