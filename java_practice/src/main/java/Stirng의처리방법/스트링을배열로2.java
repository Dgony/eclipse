package Stirng의처리방법;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String num1 = "    010-245-1234    ";
		
		// 1. 양쪽 공백을 제거하시오
		String num2 = num1.trim();
		System.out.println(num2);
	
		// 2. -을 기준으로 분리해내세요.
		String[] arr1 = num2.split("-");
		System.out.println(Arrays.toString(arr1));
		
		// 3. 첫번재 문자열이 011이면 SK, 019면 LG, 나머지면 APPLE
		String result1 = "";
		switch (arr1[0]) {
		case "011" :
			result1 = "SK"; 
			break;
		case "019" :
			result1 = "LG"; 
			break;
		default:
			result1 = "APPLE";
			break;
		}
		System.out.println(result1);
		
		// 4. 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		String result2 = "";
		if (arr1[1].length() > 4) {
			result2 = "최신폰";
		} else {
			result2 = "올드폰";
		}
		System.out.println(result2);
		
		// 5. 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 전화번호
		if (num2.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		

	}

}
