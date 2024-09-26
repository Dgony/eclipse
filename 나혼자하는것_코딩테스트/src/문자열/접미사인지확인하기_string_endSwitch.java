package 문자열;

public class 접미사인지확인하기_string_endSwitch {

	public static void main(String[] args) {
		// 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
		// 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		// 문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ my_string의 길이 ≤ 100
		// 1 ≤ is_suffix의 길이 ≤ 100
		// my_string과 is_suffix는 영소문자로만 이루어져 있습니다.
		
		String my_string = "banana";
		String is_suffix = "abanana";
		
		// 1. 접두사를 확인하는 방법이었던 startswitch를 조사하던 중 알게 된 endswitch를 사용하면 될 듯 
		
		System.out.println(my_string.endsWith(is_suffix) ? 1 : 0);
	}
	
}
