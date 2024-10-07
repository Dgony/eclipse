package 문자열;

public class A강조하기 {

	public static void main(String[] args) {
		// 문자열 myString이 주어집니다. 
		// myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
		// "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
		// 1 ≤ myString의 길이 ≤ 20
		// myString은 알파벳으로 이루어진 문자열입니다.
		
		String myString = "abstract algebra";
		
		// 1. 먼저 모조리 소문자로 바꾸고, 'A'만 대문자로 바꾸는 방법을 사용하면 될 듯
		// 2. toLowerCase와 replaceall 메서드를 사용하게 될 듯
		
		myString.toLowerCase().replace('a', 'A');
		
		System.out.println(myString);

	}

}
