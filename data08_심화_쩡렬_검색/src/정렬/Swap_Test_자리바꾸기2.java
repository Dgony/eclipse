package 정렬;

import java.util.Arrays;

public class Swap_Test_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		swap(num, 0, 1);

	}
	
	private static void swap(int[] num, int idx1, int idx2) {
		int temp = num[idx2];
		num[idx2] = num[idx1];
		num[idx1] = temp;
		print(num);
	}
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}

}
