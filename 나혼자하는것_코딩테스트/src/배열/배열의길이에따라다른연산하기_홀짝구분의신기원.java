package 배열;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기_홀짝구분의신기원 {

	public static void main(String[] args) {
		// 정수 배열 arr과 정수 n이 매개변수로 주어집니다. 
		// arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을,
		// arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ arr의 길이 ≤ 1,000
		// 1 ≤ arr의 원소 ≤ 1,000
		// 1 ≤ n ≤ 1,000
		
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
		
		// 1. 결과값 배열이 기존 배열 arr과 길이 차이가 없음 - arr에 해당하는 새로운 배열을 미리 만들어두기
		// 2. 이후 arr의 길이에 따라 홀짝처리 후 인덱스 처리
		// 3. 결과적으로 홀짝구분 + 모든 인덱스 순회를 함께 사용하는 문제인 듯
		// 4. answer[i] = arr[i] + n 가 홀짝 모두 필요함
		//	  그냥 c타입 for문을 쓰면서 홀짝에 따라 i숫자만바꿔도 되는게 아닐까?

		int[] answer = Arrays.copyOfRange(arr, 0, arr.length);
		for (int idx = arr.length % 2 * - 1 + 1; idx < answer.length; idx+=2) {
			 answer[idx] = answer[idx] + n;
		}
		// 참고할 점 - idx 설정에 있어서 삼항 연산자를 썼는데, 
		// int idx = arr.length % 2 * - 1 + 1; 
		// 위와 같이 사용하면 삼항 연산자를 사용할 필요 없음. 
		// 홀짝 여부를 구분하는데 배열의 idx는 0부터 시작하기 떄문에 위와 같은 방식의 연산으로 홀짝을 구분함.
		
		System.out.println(Arrays.toString(answer));

	}

}
