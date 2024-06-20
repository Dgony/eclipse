package 배열;

import java.util.Arrays;

public class 배열실수for문 {

	public static void main(String[] args) {
		double[] arr1 = new double[20];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 0.1;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i + " : " + arr1[i]);
		}
		
		System.out.print(Arrays.toString(arr1));

	}

}
