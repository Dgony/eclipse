package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class String의여러가지처리방법 {

	public static void main(String[] args) {
//		String s = "나는 프로그래머야!";
//		String s2= "진짜!!";
//		
//		System.out.println(s + s2); // 스트링 간의 결합
//		System.out.println(s.concat(s2)); // 이것도 스트링 결합
//		System.out.println(s.charAt(0)); // s문자열을 index 0번에 해당하는 문자 1글자 추출
//		System.out.println(s.endsWith("!")); // 특정 문자로 끝나는지 확인
//		System.out.println(s.substring(3)); // index 3이후 모든 글자 추출
//		System.out.println(s.substring(3, 8)); // index 3이후 8이전까지 글자 추출
//		System.out.println(s.contains(s2)); // s에 s2가 포함되어 있는지 확인
//		System.out.println(s.lastIndexOf("프")); // s문자열 중 "프"의 위치 확인
//		System.out.println(s.toUpperCase()); // 모두 대문자로 바꾸기
//		System.out.println(s.toLowerCase()); // 모두 소문자로 바꾸기
//		System.out.println(s.length()); // s문자열 길이 확인
//		System.out.println(s.replace("나", "너")); // s중 "나"를 "너"로 교체하기
		
		String q1 = "감자,고구마,양파";
		String[] q2 = q1.split(","); // "," 기준으로 문자열을 나눠서 배열에 집어넣는 방법
		System.out.println(Arrays.toString(q2));
		System.out.println(q2.length);
		System.out.println(q2[0]);
		
		String q3 = "      홍길동";
		System.out.println(q3.trim()); // 공백 제거해주는 함수
		q3 = q3.replace("      ", ""); // 비파괴형 함수라 다시 할당해줘야 함
		System.out.println(q3);
		
		String q4 = "홍길동";
		char w4 = q4.charAt(0);
		if (w4 == '홍') {
			System.out.println("홍씨 가문이시군요.!");
		} else {
			System.out.println("홍씨 가문이 아니시군요.!");
		}
		
		char[] w5 = q4.toCharArray(); // {'홍','길','동'} 으로 나눠서 집어넣기
		System.out.println(Arrays.toString(w5));
		
		// 일, 월, 화 날씨를 순서대로 입력해보세ㅐ요. ("흐림,맑음,흐림")
		// 흐림이 몇개인지, 맑음이 몇개인지 세어보세요.
		// 1. sc.next()로 받아서
		// 2. 스트링을 배열로 변환해서 넣어보세요
		// 3. count 해보세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일요일 날씨를 입력해주세요. >> ");
		String sun = sc.next();
		System.out.print("월요일 날씨를 입력해주세요. >> ");
		String mon = sc.next();
		System.out.print("화요일 날씨를 입력해주세요. >> ");
		String tue = sc.next();
		
		String tem = sun + "," + mon + "," + tue;
		String[]  result = tem.split(",");
		System.out.println(Arrays.toString(result));
		
		int co1 = 0, co2 = 0; 
		for (String st : result) {
			if (st.equals("흐림")) {
				co1++;
			} else if (st.equals("맑음")){
				co2++;
			}
		}
		System.out.println("흐린 날은 " + co1 + "개, 맑은 날은 " + co2 + "개");		
	}

}
