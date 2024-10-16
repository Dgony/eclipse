package 배열;

import java.util.Arrays;

public class 배열비교하기_Integer_compare두정수비교 {

	public static void main(String[] args) {
		// 이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
		// 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
		// 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
		// 두 정수 배열 arr1과 arr2가 주어질 때, 
		// 위에서 정의한 배열의 대소관계에 대하여 arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.		
		// 1 ≤ arr1의 길이 ≤ 100
		// 1 ≤ arr2의 길이 ≤ 100
		// 1 ≤ arr1의 원소 ≤ 100
		// 1 ≤ arr2의 원소 ≤ 100
		// 문제에서 정의한 배열의 대소관계가 일반적인 프로그래밍 언어에서 정의된 배열의 대소관계와 다를 수 있는 점에 유의해주세요.
		
		int[] arr1 = {100, 17, 84, 1, 1, 1};
		int[] arr2 = {55, 12, 65, 36, 100};
		
		// 1. if문을 두번 쓰거나 삼항연산자를 두번 써야함 - 그러면 반복문을 써야하기 떄문에 삼항연산자 대신 if문을 쓰는 것이 좋겠다.
		// 2. 3가지 case를 확보해야 하기 때문에 최소 2번의 비교가 필요함 
		// 3. 그럼 길이로 return 하나, 그 후 비교로 return 하나씩 만들어야겠다.
		
		int answer = 0;
		
		int sum1 = 0;
		int sum2 = 0;
		if (arr1.length != arr2.length) {
			answer = arr1.length > arr2.length ? 1 : -1;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			if (sum1 != sum2) {
				answer = sum1 > sum2 ? 1 : -1;
			}
			answer = 0;
		}
		
		System.out.println(answer);
		
		
		// 인상깊은 풀이
		
		// int answer = Integer.compare(arr1.length, arr2.length);

        // if(answer == 0) {
		// answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        // }

        // return answer;
		

	}

}
