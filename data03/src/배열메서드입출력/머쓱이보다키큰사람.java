package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 머쓱이보다키큰사람 {

	public static void main(String[] args) {
		
		
		Solution5 s = new Solution5();
		int[] numbers = {149, 180, 192, 170};
		int height = 167;
		int result = s.solution(numbers, height);
		System.out.println(result);
		
	}

}

class Solution5 {
	public int solution(int[] array, int height) {
        int answer = 0;
        for (int x : array) {
			if (x > height) {
				answer++;
			}
		}
        return answer;
        
    }
}
