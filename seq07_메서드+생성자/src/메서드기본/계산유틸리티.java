package 메서드기본;

public class 계산유틸리티 {

	public static void main(String[] args) {
		double num = 567.1234;
		double num2 = -567.1234;
		
		System.out.println(Math.abs(num2)); // abs = 절댓값 반환하기;
		System.out.println(Math.ceil(num)); // ceil = 무조건 올림 반환;
		System.out.println(Math.floor(num)); // floor = 무조건 버림 반환;
		System.out.println(Math.round(num)); // round = 반올림하기;
		System.out.println(Math.sqrt(num));
		System.out.println(Math.pow(num, 2)); // num = 왼쪽의 오른쪽 제곱
		System.out.println(Math.max(num, num2)); // max = 둘 중 큰 값 반환
		System.out.println(Math.min(num, num2)); // min = 둘 중 작은 값 반환
	}
	// 유틸리티 = java.util.*;
	//           date, random 등
	// 핵심유틸리티, 너무 자주 쓰는 것들 - java.lang.*;
	//                            System, String
}

