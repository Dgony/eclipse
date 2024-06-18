package 스위치와조건문;

import java.util.Scanner;

public class while로가위바위보 {

	public static void main(String[] args) {
		// 가위바위보를 이겨야 끝낼 수 있는 반복문 작성
		// 매개변수가 true일 때 반복하는 while문이 제격
		
		String rock =  "바위";
		String player = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위바위보를 시작하자");
		
		while(!player.equals("보")) {
			System.out.println("가위바위보! >> ");
			player = sc.next();
		}
		
		System.out.println("이겼다!");

	}

}
