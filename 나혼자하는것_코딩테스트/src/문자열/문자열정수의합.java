package 문자열;

public class 문자열정수의합 {

	public static void main(String[] args) {
		// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때,
		// 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
		// 3 ≤ num_str ≤ 100
		
		String num_str = "123456789";
		
		// 1. 아마 num_str을 반복한 다음 한 변수에 나머지를 추가하면 될 듯
		
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += (int)num_str.charAt(i);
		}
		
		System.out.println(answer);

	}

}
