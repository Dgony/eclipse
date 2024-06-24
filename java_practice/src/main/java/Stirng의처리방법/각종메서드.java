package Stirng의처리방법;

import java.util.Arrays;

public class 각종메서드 {

	public static void main(String[] args) {
		// String을 처리하는 다양한 방법들
		String s1 = "  나는 프로그래머야!aBCd  ";
		String s2 = "진짜!";
		
		System.out.println(s1.concat(s2)); // 문자열 결합 메서드
		System.out.println(s1 + s2);
		System.out.println(s1.charAt(1)); // 1글자 추출
		System.out.println(s1.endsWith("야")); // 특정 글자로 끝나는지 확인
		System.out.println(s1.substring(3)); // index 2 이후 전부 출력
		System.out.println(s1.substring(3, 8)); // index 3~7 출력
		System.out.println(s1.contains(s2)); // 문자열 포함 확인
		System.out.println(s1.lastIndexOf("프")); // 특정 글자의 위치(겹치면 마지막)
		System.out.println(s1.toUpperCase()); // 대문자로
		System.out.println(s1.toLowerCase()); // 소문자로
		System.out.println(s1.length()); // 글자수 체크
		System.out.println(s1.replace("나", "너")); // 왼쪽항을 오른쪽항으로 교체
		System.out.println(s1.indexOf("나")); // 특정 글자의 인덱스를 찾아주는 메서드
		System.out.println(s1.trim()); // String의 앞 뒤 공백을 자르는 메서드
		
		String[] arr1 = s1.split(""); // 문자열을 특정 단어 기준으로 해서 배열로 분리하는 방법
		// 공백을 기준으로 하면 모든 단어를 분리하는 다음과 같은 결과를 보여준다.
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = s1.toCharArray(); // 문자열을 char 데이터 타입 배열에 집어넣는 방법
		System.out.println(Arrays.toString(arr2));
		
	}

}
