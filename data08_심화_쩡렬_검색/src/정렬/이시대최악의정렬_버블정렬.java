package 정렬;

import java.util.Arrays;

public class 이시대최악의정렬_버블정렬 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		for (int i = num.length - 1; i >= 0; i++) {
			for (int j = 0; j < i ;j++) {
				if (num[j] > num[j + 1]) {
					swap(num, j, j + 1);
				} // if
			} // for(j)
		} // for(i)
	} // main
	
	private static void swap(int[] num, int idx1, int idx2) {
		int temp = num[idx2];
		num[idx2] = num[idx1];
		num[idx1] = temp;
		print(num);
	} // swap
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	} // print

}
