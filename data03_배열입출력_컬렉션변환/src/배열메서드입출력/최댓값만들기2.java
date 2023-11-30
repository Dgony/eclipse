package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		
		
		Solution2 s = new Solution2();
		int[] numbers = {0, -31, 24, 10, 1, 9};
		int result = s.solution(numbers);
		System.out.println(result);
		
	}

}

class Solution2 {
    public int solution(int[] numbers) {
    	Arrays.sort(numbers); // 파괴형, 원본이 바뀜
        int last1 = numbers[numbers.length - 1];
        int last2 = numbers[numbers.length - 2];
        int post = last1 * last2;
        
        int first1 = numbers[0];
        int first2 = numbers[1];
        int pre = first1 * first2;
        
        int result = pre > post ? pre : post;
        
        return result;
    }
}
