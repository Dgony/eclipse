package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class String다루기문제 {

	public static void main(String[] args) {
		// 전화번호 입력 >> 011-245-1234
		// 양쪽 공백을 제거하시오
		// -를 기준으로 분리해내세여(String[])
		// 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면Apple
		// 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		// 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유호하지 않은 전화번호
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호를 입력해주세요. >> ");
		String num1 = sc.next().trim();
		String[] num2 = num1.split("-");
				
		if (num2[0].equals("011")) {
			System.out.println("SK");
		} else if (num2[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if (num2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		int sum = 0;
		for (String x : num2) {
			sum += x.length();
		}
		
		if (sum >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		System.out.println(Arrays.toString(num2));
	}

}
