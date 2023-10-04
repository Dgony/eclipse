package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 랜덤배열저장 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
