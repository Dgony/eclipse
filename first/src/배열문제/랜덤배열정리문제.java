package 배열문제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class 랜덤배열정리문제 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[1000];
		
		int thr = 0, fou = 0, fiv = 0, six = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000);
			if (arr[i] > 600) {
				six++;
			} else if (arr[i] > 500) {
				fiv++;
			} else if (arr[i] > 400) {
				fou++;
			} else if (arr[i] > 300) {
				thr++;
			}
		}
		System.out.println(
				"300이상의 숫자는 " + thr + "개\n" + 
				"400이상의 숫자는 " + fou + "개\n" + 
				"500이상의 숫자는 " + fiv + "개\n" + 
				"600이상의 숫자는 " + six + "개"
				);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}

