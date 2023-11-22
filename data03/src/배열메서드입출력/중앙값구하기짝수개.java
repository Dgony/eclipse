package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 중앙값구하기짝수개 {

	public static void main(String[] args) {
		
		
		Solution4 s = new Solution4();
		int[] numbers = {0, -31, 24, 10, 1, 9, 11, 12};
		int result = s.solution(numbers);
		System.out.println(result);
		
	}

}

class Solution4 {
	public int solution(int[] array) {
		Arrays.sort(array);
		int median = array.length / 2;
        int answer = array[median] + array[median - 1];
        return answer;
    }
}
