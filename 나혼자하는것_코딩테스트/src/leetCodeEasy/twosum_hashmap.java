package leetCodeEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum_hashmap {

	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		
	}
	
	public int[] twoSum(int[]nums, int target) {
		
		Map<Integer, Integer> sp = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (sp.containsKey(target - nums[i])) {
				return new int[] {sp.get(target - nums[i]), i};
			} else {
				sp.put(nums[i], i);
			}
			
		}
		
		return new int[] {};
	}

}
