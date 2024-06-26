package 제어문;

import java.util.Scanner;

public class idpw일치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id를 입력해주세요 >> ");
		String id = sc.next();
		System.out.print("pw를 입력해주세요 >> ");
		int pw = sc.nextInt();
		
		if (id.equals("root") && pw == 1234) {
			System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패!");
		}
	}

}
