package 배열;

import java.util.Arrays;

public class 가까운수 {

	public static void main(String[] args) {
		// 정수 배열 array와 정수 n이 매개변수로 주어질 때, 
		// array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
		// 1 ≤ array의 길이 ≤ 100
		// 1 ≤ array의 원소 ≤ 100
		// 1 ≤ n ≤ 100
		// 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
		
		int[] array = {3, 10, 28};
		int n = 20;
		
		// 1. 가까운 값을 판단하려면 n과 가까운지 판단할 기준이 되는 변수 생성 
		// 2. 배열을 순회하며 해당 변수 갱신  
		
		int answer = 0;
		
		Arrays.sort(array);
		
		for (int i : array) {
			
		}
		
		System.out.println(answer);

	}

}
