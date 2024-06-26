package 제어문;

import java.util.Scanner;

public class for문인기투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int bts = 0;
		int jean = 0;
		
		System.out.println("인기투표시스템");
		System.out.println("===========");
		for (int i = 0; i < 1; i++) {
			System.out.print("최애를 골라주세요. >> ");
			int answer = sc.nextInt();
			i--;
			if (answer == 1) {
				iu++;
			} else if (answer == 2) {
				bts++;
			} else if (answer == 3) {
				jean++;
			} else if (answer == 4) {
				i += 2;
			} else {
				System.out.println("1~4까지의 숫자만 입력해주세요.");
			}
		}
		System.out.println("아이유 " + iu + "표");
		System.out.println("방탄 " + bts + "표");
		System.out.println("뉴진스 " + jean + "표");
	}

}
