package leetCodeEasy;

public class removeElement {

	public static void main(String[] args) {
		
		// 정수 배열 nums와 정수 k가 주어질 때, 
		// 정수 k와 겹치는 nums의 요소를 제거하고 순서대로 정렬
		// 이렇게 k와 겹치지 않는 요소의 갯수(배열의 길이)를 반환
		// 이때 배열은 반환하지 않더라도 시스템에서 판단하기 때문에 배열도 조작 필수
		// nums의 길이는 0 ~ 100
		// nums의 요소는 0 ~ 50
		// k의 범위는 0 ~ 100
		
		int[] nums = {3,2,2,3};
		int val = 3;
		
		// 길이가 1인 배열은 무조건 그대로 반환  
		
		if(nums.length == 0) System.out.println(0);
		
		int p = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[p]) {
				
			}
		}
		
		
	}

}
