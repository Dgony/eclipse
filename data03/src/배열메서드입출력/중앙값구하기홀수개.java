package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기홀수개 {

	public static void main(String[] args) {
		
		
		Solution3 s = new Solution3();
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int result = s.solution(numbers);
		System.out.println(result);
		
	}

}

class Solution3 {
	public int solution(int[] array) {
		Arrays.sort(array);
		int median = array.length / 2;
        int answer = array[median];
        return answer;
    }
}
