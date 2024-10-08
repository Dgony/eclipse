package 문자열;

public class 원하는문자열찾기_대소문자구분_contains {

	public static void main(String[] args) {
		// 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. 
		// myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
		// 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
		// 1 ≤ myString의 길이 ≤ 100,000
		// 1 ≤ pat의 길이 ≤ 300
		// myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.
		
		String myString = "AbCdEfG";
		String pat = "aBc";
		
		// 1. 그냥 포함하는지를 확인하면 contains를 쓰면 되겠지만, 대소문자임을 통일해야 하기에
		//	  toUppercase 나 toLowercase를 통해 문자열을 통일하고 진행해야 할 듯
		
		System.out.println(myString.toLowerCase().contains(pat.toLowerCase()));


	}

}
