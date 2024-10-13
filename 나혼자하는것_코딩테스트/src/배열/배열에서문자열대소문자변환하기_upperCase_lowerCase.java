package 배열;

import java.util.Arrays;

public class 배열에서문자열대소문자변환하기_upperCase_lowerCase {

	public static void main(String[] args) {
		// 문자열 배열 strArr가 주어집니다. 
		// 모든 원소가 알파벳으로만 이루어져 있을 때, 
		// 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
		// 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
		// 1 ≤ strArr ≤ 20
		// 1 ≤ strArr의 원소의 길이 ≤ 20
		// strArr의 원소는 알파벳으로 이루어진 문자열 입니다.
		
		String[] strArr = {"AAA","BBB","CCC","DDD"};
		
		// 1. 홀짝은 %를 통한 나머지로 홀짝판단 알고리즘 가능, 
		// 2. 그 다음 그냥 upper lowercase 쓰면 될 것 같다.  
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		
		System.out.println(Arrays.toString(strArr));

	}

}
