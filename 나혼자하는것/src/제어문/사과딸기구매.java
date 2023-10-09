package 제어문;

import java.util.Scanner;

public class 사과딸기구매 {

	public static void main(String[] args) {
		int app1 = 500;
		int str1 = 1500;
		
		Scanner	sc = new Scanner(System.in);
		System.out.print("구매할 사과 갯수를 입력해주세요.");
		int app2 = sc.nextInt();
		System.out.print("구매할 딸기 갯수를 입력해주세요.");
		int str2 = sc.nextInt();
		int appprice = app1 * app2;
		int strprice = str1 * str2;
		int fruit = appprice + strprice;
		
		System.out.println("사과 구매 가격은 " + appprice + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + strprice + "원 입니다.");
		System.out.println("내가 오늘 과일에 쓴 돈은 " + fruit + "원 입니다.");
	}

}
