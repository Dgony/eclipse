package GUI클래스;

import java.util.Scanner;

public class Scanner_메서드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은? >> ");
		String name = sc.next();
		
		System.out.print("나의 키는? >> ");
		double height = sc.nextDouble();
		
		System.out.print("나의 몸무게는? >> ");
		double weight = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? >> ");
		boolean dinner = sc.nextBoolean();
		
		sc.nextLine();
		System.out.print("나의 좌우명은? >>");
		String word = sc.nextLine();
		
		System.out.println(
				"내 이름은 " + name + "입니다. \n"
				+ "나의 키는 " + height + "입니다. \n"
				+ "나의 몸무게는 " + weight + "입니다. \n"
				+ "나는 저녁을 " + dinner + "입니다. \n"
				+ "나의 좌우명은 " + word + "입니다.");
		
		sc.close();

	}

}
