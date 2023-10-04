package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		
		while (true) {
			int computer1 = r.nextInt(1);
			String computer2 = "";
			System.out.print("당신의 선택은? >> ");
			int human1 = sc.nextInt();
			String human2 = "";
			if (computer1 == 0) {
				computer2 = "컴퓨터 : 가위";
			} else if (computer1 == 1) {
				computer2 = "컴퓨터 : 바위";
			} else {
				computer2 = "컴퓨터 : 보";
			}
			if (human1 == 0) {
				human2 = "나 : 가위";
			} else if (human1 == 1) {
				human2 = "나 : 바위";
			} else {
				human2 = "나 : 보";
			}
			System.out.println(computer2);
			System.out.println(human2);
			String result = "";
			if (human1 == 0) {
				if (computer1 == 0) {
					result = "비겼습니다!";
				}
				if (computer1 == 1) {
					result = "졌습니다!";
				}
				if (computer1 == 2) {
					result = "이겼습니다!";
				}

			} else if (human1 == 1) {
				if (computer1 == 1) {
					result = "비겼습니다!";
				}
				if (computer1 == 2) {
					result = "졌습니다!";
				}
				if (computer1 == 0) {
					result = "이겼습니다!";
				}
			} else {
				if (computer1 == 2) {
					result = "비겼습니다!";
				}
				if (computer1 == 0) {
					result = "졌습니다!";
				}
				if (computer1 == 1) {
					result = "이겼습니다!";
				}
			}
			if(result.equals("이겼습니다!")) {
				win++;
			} else if (result.equals("졌습니다!")) {
				lose++;
			}
			System.out.println(result);
			System.out.print("종료하시려면 x를 입력해주세요. >> ");
			String exit = sc.next().toLowerCase();
			char exit2 = exit.charAt(0);
			if(exit2 == 'x') {
				System.out.println("가위바위보를 끝내겠습니다. " + win + "번 이기고, " + lose + "번 졌습니다.");
				System.exit(0);
			}
			
		}
		
	}

}
