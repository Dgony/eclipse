package 문자열;

public class 대소문자바꾸기 {

	public static void main(String[] args) {
		// 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
		// 각 알파벳 대문자는 소문자로 알파벳 소문자는 대문자로 바꿔서 출력하기
		String str = "aBcDeFg";
		
		// 1. 대소문자를 감지해야 uppercase, lowercase 메서드를 적용 가능.
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
		// 2. Character.isUpperCase(), toUpperCase()등의 메서드로 한글자의 대문자여부 판단 후 변환.
				answer += Character.toLowerCase(str.charAt(i));
			} else {
				answer += Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(answer);
		
		

	}

}
