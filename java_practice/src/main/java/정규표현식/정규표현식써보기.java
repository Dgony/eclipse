package 정규표현식;

import java.util.regex.Pattern;

public class 정규표현식써보기 {

	public static void main(String[] args) {
		String pt = "^[a-zA-z]*$"; // 영문자로 시작하고 끝나는 0개 이상의 영문 단어
		String str1 = "abcaa";
		String str2 = "123";
		String str3 = "";
		
		System.out.println(pt);
		
		boolean result1 = Pattern.matches(pt, str1);
		boolean result2 = Pattern.matches(pt, str2);
		boolean result3 = Pattern.matches(pt, str3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
