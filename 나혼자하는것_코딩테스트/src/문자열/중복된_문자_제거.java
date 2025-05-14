package 문자열;

public class 중복된_문자_제거 {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어집니다. 
		// my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

		// 제한사항
		// 1 ≤ my_string ≤ 110
		// my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
		// 대문자와 소문자를 구분합니다.
		// 공백(" ")도 하나의 문자로 구분합니다.
		// 중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
		
		String my_string1 = "people";
		String my_strong2 = "We are the world";
		
		// 1. 문자열의 중복 체크  
		//    문자열을 순회하며 저장하고, contain으로 확인
		// 2. 하나의 문자열만 return? 
		//    replace가 문자열 자체를 변화시키는 파괴함수였는지 확인할 필요  
		
		String str = "";
		
		for (char s : my_string1.toCharArray()) {
			// str의 my_string 문자 포함 여부에 따라 추가 혹은 넘김  
			str += str.contains(s + "") ? "" : s;
		}
		
		System.out.println(str);
		

	}

}
