package 문자열;

public class 숫자0떼기_parseInt를이용한문자열앞0떼기 {

	public static void main(String[] args) {
		// 정수로 이루어진 문자열 n_str이 주어질 때,
		// n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요
		// 2 ≤ n_str ≤ 10
		// n_str이 "0"으로만 이루어진 경우는 없습니다.
		
		String n_str = "854020";
		
		int answer = Integer.parseInt(n_str);
		
		System.out.println(answer);
		

	}

}
