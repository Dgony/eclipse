package leetCodeEasy;

public class searchInesrtPosition_index {

	public static void main(String[] args) {
		
		// 서로 다른 정수의 구성으로 정렬된 배열과 목표값이 주어질 때,  
		// 배열에서 목표값을 찾은 경우 해당 index 반환 
		// 배열에 목표값이 존재하지 않는 경우 목표값이 존재해야하는 index를 반환
		// O(log n)의 시간복잡도를 고려하는 알고리즘을 구성해야 함.  
		
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		
		// 1. 반환하는 것은 int
		// 2. 목표값 or 목표값보다 큰 값을 만난 순간 index 반환  
		
		System.out.println(target > nums[nums.length-1]);
		
		int answer = 0; 
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
		// 소요 시간 0ms
		// 시간복잡도 O(log n)
		// 공간복잡도 O(1)
		

	}

}
