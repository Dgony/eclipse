package 코딩테스트;

import java.util.Arrays;

public class 배열의가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] array2 = new int[array.length];
		int[] answer = new int[2];
		
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		Arrays.sort(array2);
		
		for (int i = 0; i < array2.length; i++) {
			if (array2[array2.length-1] == array[i]) {
				answer[1] = i;
			}
		}
		
		answer[0] = array2[array2.length-1];
		
		
		
	}

}
