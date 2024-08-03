package 코딩테스트;

import java.util.Arrays;

public class 배열두배만들기 {

	public static void main(String[] args) {
		// 정수 배열 numbers가 매개 변수로 주어집니다.
		// number의 각 원소의 두배한 원소를 return 하도록 함수 완성
		int[] numbers = {1, 2, 3, 4, 5};
		int[] answer = new int[numbers.length];
		
		// 1. 주어진 배열의 모든 원소를 꺼내야 함
		// 2. 꺼낸 원소들을 *2
		// 3. 원소들을 answer 배열에 할당
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i]*2;
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		

	}

}
