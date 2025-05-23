package 배열;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {

	public static void main(String[] args) {
		// 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. 
		// arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.
		// 제한사항
		// 1 ≤ arr의 길이 ≤ 1,000
		// 1 ≤ arr의 원소 ≤ 1,000
		
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {58, 172, 746, 89};
		
		// 1. 2의 거듭제곱은 4, 8, 16, 32, 64....
		// 2. 길이가 2의 거듭제곱과 얼마나 차이나는지 판단하기 위해선 
		//    당장 생각나는건 재귀함수를 통해 거듭제곱을 거쳐가며 배열 길이를 만족하지 못하는 순간 
		//    해당 거듭제곱을 반환하고 조건에 맞는 결과 배열 반환
		// 3. 근데 그냥 한 클래스 안에서 해결하게 반복문으로 가야겠다.  
		
		int x = 2;
		
		while(arr1.length > x) {
			x *= 2;
		}
		
		int[] answer = new int[x];
		
		for (int i = 0; i < arr1.length; i++) {
			answer[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(answer));
		

	}

}
