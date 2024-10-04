package 문자열;

public class I로만들기 {

	public static void main(String[] args) {
		// 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
		// 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ myString ≤ 100,000
		// myString은 알파벳 소문자로 이루어진 문자열입니다.
		
		String myString = "abcdevwxyz";
		
		// 1. 알파벳 'l'보다 앞서는 문자를 판단하려면 부등호 긋고 아스키코드로 판단하면 될 듯?
		// 2. if문과 replace 메서드를 사용하면 될 듯
		
		String answer = "";
		for (char x : myString.toCharArray()) {
			answer += x < 'l' ? 'l' : x;
		}
		
		// 인상 깊은 풀이
		// replace와 정규 표현식을 통해 l이전에 해당하는 문자들을 l로 바꿔버림
		myString.replaceAll("[^l-z]", "l");
		
		
		System.out.println(answer);
	}

}
