package 스위치와조건문;

import java.util.Scanner;

public class 조건문확인 {

	public static void main(String[] args) {
		// 1. 암호를 대시오 - pass, 암호가 맞으면 들어오세요, 틀리면 나가세요
		// 암호를 입력하는 scanner, 암호를 판단하는 조건문, 이후 결과 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("암호를 입력해주세요. >> ");
		int pw = sc.nextInt();
		
		if (pw == 1234) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		
		// 2. 과목 점수에 따라 90점부터 10점마다 다른 등급 부여
		System.out.println("컴퓨터 과목 점수를 입력해주세요.");
		int com = sc.nextInt();
		String grade = "";
		if (com >= 90) {
			grade = "A학점";
		} else if (com >= 80) {
			grade = "B학점";
		} else if (com >= 70) {
			grade = "C학점";
		} else if (com >= 60) {
			grade = "D학점";
		} else if (com >= 50) {
			grade = "F학점";
		} else {
			grade = "재적";
		}
		
		System.out.println("컴퓨터 과목 점수는 " + grade);
		
		
		// 3. 당신이 먹고 싶은 점심 메뉴는
		System.out.println("점심 메뉴를 입력해주세요. 짜장면, 라면, 회 >> ");
		String menu = sc.next();
		String result = "";
		switch (menu) {
		case "짜장면" :
			result = "중국집";
			break;
		case "라면" : 
			result = "분식집";
			break;
		case "회" : 
			result = "횟집";
			break;

		default: result = "잡";
			break;
		}
		System.out.println(result + "(으)로 가자");

	}

}
