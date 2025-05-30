package 문자열;

public class 가운데_글자_가져오기 {

	public static void main(String[] args) {
		// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
		// 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		// 재한사항
		// s는 길이가 1 이상, 100이하인 스트링입니다.
		
		String s1 = "abcde";
		String s2 = "qwer";
		
		// 1. 길이 홀짝판단
		// 2. charat 혹은 substring으로 반환  
		
		System.err.println(s1.substring(s1.length() / 2, s1.length() / 2 + 1));

	}

}
