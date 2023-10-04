package 배열응용;

import java.util.Arrays;

public class 참조형복사 {

	public static void main(String[] args) {
		int[] n1 = {100,200,300},
			  n2 = n1, // ==> 얕은 복사				
			  n3 = n1.clone(); // ==> 깊은 복사
		System.out.println(n1 + "\n" + n2);
		
		n2[0] = 999;
		n3[0] = 888;
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
	}

}
