package 제어문.반복문;

import java.util.Scanner;

public class for문정리문제 {

	public static void main(String[] args) {
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for (int i = 33; i <= 222; i++) {
			result1 += i;
		}
		System.out.println(result1);
		for (int i = 55; i <= 4500; i += 2) {
			result2 += i;
		}
		System.out.println(result2);
		for (int i = 33; i <= 222; i += 5) {
			result3 += i;
		}
		System.out.println(result3);
		
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int yu = 0;
		int bts = 0;
		
		while(true) {
			System.out.print("최애의 번호를 입력해주세요! >> ");
			System.out.println("입력 1)아이유 2)유재석 3)방탄소년단 4)종료");
			int me = sc.nextInt();
			if(me == 1) {
				iu++;
			} else if (me == 2) {
				yu++;
			} else if (me == 3) {
				bts++;
			} else if (me == 4) {
				System.out.println("투표가 완료되었습니다.");
				System.out.println("아이유 득표수 >>> " + iu);
				System.out.println("유재석 득표수 >>> " + yu);
				System.out.println("방탄소년단 득표수 >>> " + bts);
				System.exit(0);
			} else {
				System.out.println("1부터 4까지의 숫자만 입력해주세요.");
			}
			
		}
	
		
	}

}
