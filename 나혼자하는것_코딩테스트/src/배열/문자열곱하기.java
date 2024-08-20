package 배열;

public class 문자열곱하기 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 k가 주어질 때, 
		// my_string을 k번 반복한 문자열을 return하는 solution 작성
		String my_string = "string";
		int k = 3;
		String answer = "";
		
		for (int i = 0; i < k; i++) {
			answer += my_string;
		}
		
		System.out.println(answer);
		
		
		
		
		
		// 번외, repeat 메서드가 존재함
		// java 11부터 사용 가능
		String answer2 = "";
		// System.out.println(my_string.repeat(k));
		

		
	}

}
