package 배열문제;

import java.util.Arrays;

public class 배열기초문제 {

	public static void main(String[] args) {
		int[] arr = new int[200];
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		arr[arr.length - 1] = 5000;
		System.out.println(Arrays.toString(arr));

		double[] arr2 = new double[300];
		arr2[0] = 10.1;
		arr2[1] = 20.2;
		arr2[2] = 30.2;
		arr2[arr2.length - 1] = 50.5;
		System.out.println(Arrays.toString(arr2));
	
		// 다음의 데이터를 다룰 수 있는 배열을 만들어
		// 임의의 데이터를 넣은 후, 프린트 해보시오.
		String[] trip = new String[5];
		trip[0] = "제주도";
		trip[1] = "우도";
		trip[2] = "마라도";
		trip[3] = "마파도";
		trip[4] = "강화도";
		System.out.println(Arrays.toString(trip));
		
		char[] color = new char[5];
		color[0] = '흰';
		color[1] = '빨';
		color[2] = '검';
		color[3] = '파';
		color[4] = '초';
		System.out.println(Arrays.toString(color));
		
		double[] talent = new double[5];
		talent[0] = 186.4;
		talent[1] = 175.4;
		talent[2] = 183.5;
		talent[3] = 196.1;
		talent[4] = 156.9;
		System.out.println(Arrays.toString(talent));
	}

}
