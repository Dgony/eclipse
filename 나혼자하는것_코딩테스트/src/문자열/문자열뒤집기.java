package 문자열;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
		// my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
		// my_string은 숫자와 알파벳으로만 이루어져 있습니다.
		// 1 ≤ my_string의 길이 ≤ 1,000
		// 0 ≤ s ≤ e < my_string의 길이

		String my_string1 = "Progra21Sremm3";
		String my_string2 = "Stanley1yelnatS";
	
		int s1 = 6;
		int s2 = 4;
		
		int e1 = 12;
		int e2 = 10;
		
		// 1. 필요한 부분만 뒤집은 문자열 합치기 vs Stringbuilder + replace를 이용한 전체 문자열 반환하기.  
		// 2. 전자의 경우 새 변수, 반복문, 메서드의 결합
		// 3. 후자의 경우 새 변수 여러개, 반복문 등 
		// 4. 왠지 전자의 경우가 더 편할 듯 
		
		String str = "";
		for (int i = e1; i >= s1; i--) {
			str += my_string1.charAt(i);
		}
		
		System.out.println(my_string1.substring(0, s1) + str + my_string1.substring(e1 + 1, my_string1.length()));
		
		

	}

}
