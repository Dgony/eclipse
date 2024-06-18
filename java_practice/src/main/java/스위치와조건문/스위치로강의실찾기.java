package 스위치와조건문;

import java.util.Scanner;

public class 스위치로강의실찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("강의실을 입력해주세요. 자바, 파이썬, 리눅스 >> ");
		String place = sc.next();
		
		switch (place) {
		case "자바" : 
			System.out.println("1103호로 가세요");
			break;
		case "파이썬" :
			System.out.println("1104호로 가세요");
			break;
		case "리눅스" : 
			System.out.println("1105호로 가세요");
			break;

		default: System.out.println("빈 강의실이네요.");
			break;
		}
		
	}

}
