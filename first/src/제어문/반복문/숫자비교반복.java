package 제어문.반복문;

import java.util.Scanner;

public class 숫자비교반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0;
		int post = 0;
		
		while (true) {
			System.out.print("1번 숫자를 입력해주세요. >> ");
			int n1 = sc.nextInt();
			System.out.print("2번 숫자를 입력해주세요. >> ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("앞 숫자가 더 큽니다.");
				pre++;
			} else if (n2 > n1) {
				System.out.println("뒷 숫자가 더 큽니다.");
				post++;
			} else {
				System.out.println("두 숫자가 동일합니다.");
			}
			System.out.print("더 하시겠습니까? 종료(x), 계속(o) >>> ");
			String exit = sc.next().toLowerCase();
			if (exit.equals("x")) {
				System.out.println("게임을 종료합니다. \n앞이 큰 경우는 " + pre + "회, \n뒤가 큰 경우는 " + post + "회입니다. ");
				System.out.println("게임을 종료합니다.");
				System.out.println("앞이 큰 경우는 " + pre + "회, ");
				System.out.println("뒤가 큰 경우는 " + post + "회입니다. ");
				System.exit(0);
			}
		}
		
	}

}
