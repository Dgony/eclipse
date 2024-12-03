package 정수;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
		// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
		// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		// n은 1이상 8000000000 이하인 자연수입니다.
		
		int n = 118372;
		
		// 1. return 해야 할 정수 타입은 long
		// 2. 정렬을 하려면 각 자릿수를 분리할 방법 - 배열이나 리스트 인터페이스, 변수 등에 따로 저장
		// 3. 배열 이용하기로 결정, 정렬 후 배열의 역순으로 long 변수에 할당 
		
		long answer = 0;
		
		int[] arr = new int[(n+"").length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n /= 10;
		}
		
		Arrays.sort(arr);
		
		for (int i = arr.length-1; i >= 0; i--) {
			answer += arr[i];
			if (i != 0) {
				answer *= 10;	
			}
		}
		
		System.out.println(answer);

	}

}
