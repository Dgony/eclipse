package 문자열;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

	public static void main(String[] args) {
		// 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
		// 제한사항
		// 5 ≤ myString ≤ 20
		// 1 ≤ pat ≤ 5
		// pat은 반드시 myString의 부분 문자열로 주어집니다.
		// myString과 pat에 등장하는 알파벳은 대문자와 소문자를 구분합니다.
		
		String myString = "AbCdEFG";
		String pat = "dE";
		
		// 1. 임의의 String 변수를 정하고
		// 2. 반복문으로 하나씩 더해가다가, 마지막 부분인 pat와 일치하는 순간 멈춤  
		
		String answer = "";	
		
		for (char c : myString.toCharArray()) {
			answer += c;
			if (answer.length() >= pat.length() && answer.substring(answer.length() - pat.length(), answer.length()).equals(pat)) {
				break;
			}
		}
		
		System.out.println(answer);

	}

}
