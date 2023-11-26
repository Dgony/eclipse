package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import 배열기본.Print;

public class 정수찾기 {

	public static void main(String[] args) {
		
		Solution05 s = new Solution05();
		int[] num_list = {1, 2, 3, 4, 5};
		int n = 3;
		int result = s.solution(num_list, n);
		System.out.println(result);
	}
}
	
	class Solution05 {
		public int solution(int[] num_list, int n) {
	        // num_list안에 정수 n이 있으면 1, 없으면 0반환
	        // contains 메서드 쓰면 금밤 찾을 듯
			
			int answer = 0;
	        
	        for (int i : num_list) {
				if (i == n) {
					answer = 1;
				}
			}
	        return answer;
	    }
	}