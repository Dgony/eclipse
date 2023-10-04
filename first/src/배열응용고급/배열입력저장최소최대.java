package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장최소최대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		// 1. 입력
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 >>> ");
			arr[i] = sc.nextInt();
		}
		
		// 2. 처리
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		
		// 3. 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(
				"최솟값은 " + min + "이고,\n" + 
				"최댓값은 " + max + "이다."
				);

	}

}
