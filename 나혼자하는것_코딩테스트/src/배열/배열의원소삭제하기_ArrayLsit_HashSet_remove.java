package 배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 배열의원소삭제하기_ArrayLsit_HashSet_remove {

	public static void main(String[] args) {
		// 정수 배열 arr과 delete_list가 있습니다. 
		// arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ arr의 길이 ≤ 100
		// 1 ≤ arr의 원소 ≤ 1,000
		// arr의 원소는 모두 서로 다릅니다.
		// 1 ≤ delete_list의 길이 ≤ 100
		// 1 ≤ delete_list의 원소 ≤ 1,000
		// delete_list의 원소는 모두 서로 다릅니다.
		
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		// 1. 이중 for문을 사용해 비교하면 될 듯?
		// 2. 일단 결과값 원소의 길이를 바로 알 수 없으니 list를 만들어두었다 int 배열로 바꿔야지
		// 3. 길이도 다르기 떄문에 delete_list의 값을 모아두는 hashset을 만들어두어서 해결해야 겠다.  
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();

		for (int x : delete_list) {
			set.add(x);
		}
		
		for (int y : arr) {
			if (!set.contains(y)) {
				list.add(y);
			}
		}
		
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		// remove를 활용한 인상깊은 풀이
		//import java.util.*;
		//class Solution {
		//public int[] solution(int[] arr, int[] delete_list) {
        //List<Integer> list = new ArrayList<>();
        //for(int n : arr) {
            //list.add(n);
        //}
        //for(int n: delete_list) {
            //list.remove((Integer)n);
        //}
        //int[] answer = new int[list.size()];
        //for(int i=0; i<list.size(); i++){
            //answer[i] = list.get(i);
        //}
        //return answer;
    //}
//}
		
		

	}

}
