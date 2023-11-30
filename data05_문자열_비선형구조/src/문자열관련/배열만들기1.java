package 문자열관련;

import java.util.ArrayList;

import 배열기본.Print;

public class 배열만들기1 {

	public static void main(String[] args) {
		
		Solution04 s = new Solution04();
		int n = 10;
		int k = 3;
		ArrayList<Integer> result = s.solution(n, k);
		System.out.println(result);
	}
}
	
	class Solution04 {
	    public ArrayList<Integer> solution(int n, int k) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i = 1; i <= n; i++) {
				if (i % k == 0) {
					list.add(i);
				}
			}
	        return list;
	    }
	}