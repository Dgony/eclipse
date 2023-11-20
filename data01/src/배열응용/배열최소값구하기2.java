package 배열응용;

import java.util.Random;

import 배열기본.Print;

public class 배열최소값구하기2 {

	public static void main(String[] args) {
		// 랜덤한 값 1000개를 배열에 넣어서
		Random r = new Random(100);
		int [] list = new int[1000];
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(100000);
		}	
		
		// 1. 최소값 구하기	
		// 2. 최대값 구하기
		int min = list[0];
		int max = list[0];
		for (int x : list) {
			if (x < min) {
				min = x;
			} else if (x > max) {
				max = x;
			}
		}
		
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
		Print.arr(list);
		
	} // main

}
