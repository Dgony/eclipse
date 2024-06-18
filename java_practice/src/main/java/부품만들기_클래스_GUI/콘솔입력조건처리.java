package 부품만들기_클래스_GUI;

import java.util.Scanner;

public class 콘솔입력조건처리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일 입력 : 1)주중 2)주말 >> ");
		int week = sc.nextInt();
		
		if (week == 1) {
			System.out.println("열심히 공부합시다!");
		} else {
			System.out.println("열심히 놀아봅시다!");
		}

	}

}
