package 배열;

import java.util.Arrays;

public class 특별한이차원배열_int배열자동원소지정 {

	public static void main(String[] args) {
		// 정수 n이 매개변수로 주어질 때, 
		// 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
		// arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
		
		int n = 6;
		
		// 1. 그럼 [n][n]의 이차원 배열을 만들고
		// 2. 반복문을 통해 j의 인덱스에 1을 할당하도록 하면 되겠네?
		
		int[][] arr = new int[n][n];
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			arr[i][j] = 1;
		}

		System.out.println(Arrays.toString(arr));
	}

}
