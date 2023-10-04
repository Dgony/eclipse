package 제어문.순차문;

import java.util.Scanner;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력해주세요. >> ");
		String name = sc.next() ;
		
		System.out.print("키를 입력해주세요. >> ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력해주세요. >> ");
		double weight = sc.nextDouble();
		
		System.out.print("오늘 저녁을 먹었나요? >> ");
		boolean dinner = sc.nextBoolean();
		
		sc.nextLine();
		System.out.print("당신의 좌우명은? >> ");
		String jwau = sc.nextLine();
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (height + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은  " + jwau + "입니다.");
		
	}

}
