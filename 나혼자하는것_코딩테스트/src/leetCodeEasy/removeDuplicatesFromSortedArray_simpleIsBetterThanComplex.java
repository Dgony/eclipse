package leetCodeEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicatesFromSortedArray_simpleIsBetterThanComplex {

	public static void main(String[] args) {
		
		// 내림차순으로 정렬된 정수 배열 nums가 주어짐
		// 배열의 중복되지 않는 순서대로 index 0부터 nums 배열 나열
		// 나열 이후 배열의 뒷부분 요소들은 신경 x
		// 이후 중복을 제거한 요소의 갯수를 return 
		
		int[] nums = {1,1,2};
		
		
		// map에 중복 여부 저장
		// index도 저장하고 대체 성공하면 index +1
		
		Map<Integer, Integer> dup = new HashMap<>(); 
		
		dup.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			
			if (!dup.containsKey(nums[i])) {
				dup.put(nums[i], dup.get(nums[i-1]) + 1);
				nums[dup.get(nums[i])] = nums[i];
			} else if (nums[i] == nums[nums.length-1]) {
				break;
			}
			System.out.println(dup.get(i));
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(dup.get(nums[nums.length-1]) + 1);
		
		
		// 상태 저장이라는 함정에 빠져 map을 이용해야 된다는 강박관념에 빠진 자의 어리석음으로 인해 구현하지 못한 코드
		/*
		 * class Solution { public int removeDuplicates(int[] nums) { if (nums.length ==
		 * 0) return 0;
		 * 
		 * int i = 0; // pointer for the last unique element for (int j = 1; j <
		 * nums.length; j++) { if (nums[j] != nums[i]) { i++; nums[i] = nums[j]; } }
		 * return i + 1; // number of unique elements } }
		 */
		
		

	}
	
	

}
