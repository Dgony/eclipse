package leetCodeEasy;

import java.util.Stack;

public class palindromeNumber_나머지활용 {

	public static void main(String[] args) {

		// x가 주어질 때, x가 panlindrome number이면 true를 반환, 그렇지 않으면 false를 반환
		
		int x1 = 1001;
		int x2 = -121;
		int x3 = 10;
		
		// 1. map을 사용해 key value에 index와 값을 저장하고 가운데 숫자만 건너뛰면 될 듯?
		// 2. x를 int 그대로 쓰고자 한다면 10으로 나누면 어떨까?
		// 3. map이 아니면 FILO인 stack을 쓰면 어떨까?
		// 4. 아니다 임의의 변수에 나머지를 저장하면서 순회한다음 결과물을 비교하면 어떨까?
		
		int answer = 0;
		
		while(x1 % 10 > 0 || x1 >= 10) {
			answer *= 10;
			answer += x1 % 10;
			x1 /= 10;
		}
		

	}

	
}
