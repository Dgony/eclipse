package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 아이스아메리카노문제 {

	public static void main(String[] args) {
		
		
		Solution7 s = new Solution7();
		int numbers = 5500;
		int[] result = s.solution(numbers);
		System.out.println(result);
		
	}

}

class Solution7 {
	public int[] solution(int money) {
		int count = money / 5500;
		int change = money % 5500;
        int[] answer = {count, change};
        return answer;
    }
}
