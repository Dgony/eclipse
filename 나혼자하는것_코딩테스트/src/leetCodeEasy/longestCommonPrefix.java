package leetCodeEasy;

import java.util.HashMap;
import java.util.Map;

public class longestCommonPrefix {

	public static void main(String[] args) {
		
		// 배열의 문자열 요소들이 가지는 가장 긴 공통 접두사를 찾는 함수 만들기
		// 공통의 접두사가 없으면 빈 문자열 반환 
		// 문자열은 소문자 영어로만 구성 
		
		String[] strs1 = {"flower","flow","flight"};
		String[] strs2 = {"dog","racecar","car"};
		
		// strs1은 'fl'이 가장 긴 공통 접두사
		// strs2은 없다 
		// 문자열을 잡고 나머지랑 비교?
		// map을 사용해야 하나?  
		// 일치하는 접두사가 없으면 1회 반복 끝
		// 접두사 길이가 늘어날수록 여러번 반복해야함  
		// swtich에 변수를 넣고 봐야하나?
		
		Map<String, String> sp = new HashMap<>();
		
		String s = "";

		for (int i = 0; i < strs1[0].length(); i++) {
			
			for (int j = 0; j < strs1.length; j++) {
				if (!strs1[j].startsWith(strs1[0].charAt(i)+"")) {
					
				}
			}
			s += strs1[0].charAt(i);
			
		}
		
		
		// 전역 변수로 문자열의 길이를 계산해 접두사를 빨리 찾는 방법  
		/*
		 * class Solution { public String longestCommonPrefix(String[] strs) { String
		 * pref = strs[0]; int prefixLen = pref.length(); for(int i = 1; i <
		 * strs.length; i++) { String word = strs[i]; while(prefixLen > word.length() ||
		 * !pref.equals(word.substring(0, prefixLen))) { prefixLen--; if(prefixLen == 0)
		 * return ""; pref = pref.substring(0, prefixLen); } } return pref; } }
		 */
		
	}

}
