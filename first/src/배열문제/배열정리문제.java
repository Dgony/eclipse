package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// scanner를 사용해서 문제 풀기
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 5개 크기의 배열을 만들어서 10,20,30,40,50을 순서대로 넣는다.
		// 첫번재 값과 세번째 값을 더해서 프린트
		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(i + "번 숫자를 입력해주세요. >> ");
			arr1[i] = sc.nextInt();
		}
		System.out.println(arr1[0] + arr1[2]);
			
		// 2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, JSP를 순서대로 넣는다.
		// "자바 보다는 스프링" 출력;
		
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("사용하고 싶은 기술을 입력해주세요. >> ");
			arr2[i] = sc.next() ;
		}
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);
	}

}
