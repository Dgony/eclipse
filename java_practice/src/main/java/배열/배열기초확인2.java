package 배열;

import java.util.Arrays;

public class 배열기초확인2 {

	public static void main(String[] args) {
		// int
		int[] arr1 = new int[20];
		arr1[0] = 1000;
		arr1[1] = 2000;
		arr1[2] = 3000;
		arr1[arr1.length-1] = 5000;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + 1 + "번 인덱스는 " + arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));
		
		// double
		double[] arr2 = new double[30];
		arr2[0] = 10.1;
		arr2[1] = 20.1;
		arr2[2] = 30.1;
		arr2[arr2.length-1] = 50.1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(i + 1 + "번 인덱스는 " + arr2[i]);
		}
		System.out.println(Arrays.toString(arr2));
		
		// 좋아하는 여행지 5개
		// 좋아하는 색깔 5개의 첫글자
		String[] trip1 = new String[5];
		trip1[0] = "제주도"; 
		trip1[1] = "일본"; 
		trip1[2] = "괌"; 
		trip1[3] = "코타키나발루";
		trip1[4] = "하와이";
		System.out.println(Arrays.toString(trip1));
		
		char[] color1 = new char[5];
		color1[0] = 'y';
		color1[1] = 'b';
		color1[2] = 'c';
		color1[3] = 'o';
		color1[4] = 'r';
		System.out.println(color1);

	}

}
