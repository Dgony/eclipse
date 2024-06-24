package Stirng의처리방법;

import java.util.Arrays;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어 ,영어 ,수학 ,컴퓨터";
		
		// 1. String[]로 바꾸어보세요.
		String[] arr1 = all.split(",");
		System.out.println(Arrays.toString(arr1));
		
		// 2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후 배열에 넣으세요.
		// String[] arr2 = all.split(","); 이 방법은 공백을 지울 수 없음
		String[] arr2 = new String[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i].trim();
		}
		System.out.println(Arrays.toString(arr2));
		
		// 3. 과목 수는?
		System.out.println("과목 수는 " + arr2.length);
		
		// 4. 컴퓨터의 위치는?
		int count1 = 0;
		int subject = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i].equals("컴퓨터")) {
				count1 = i;
			} 
			if (arr2[i].length() < 3) {
				subject++;
			}
		}
		System.out.println("컴퓨터의 위치는 인덱스 " + count1);
		
		// 5. 과목명이 3글자 미만인 과목수는?
		System.out.println("3글자 미만의 과목명을 가지는 과목의 수는 " + subject);

	}

}
