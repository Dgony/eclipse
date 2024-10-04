package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의원소만큼추가하기_배열과리스트넘나들기 {

	public static void main(String[] args) {
		// 아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
		// 양의 정수 배열 arr가 매개변수로 주어질 때,
		// arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면
		// X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ arr의 길이 ≤ 100
		// 1 ≤ arr의 원소 ≤ 100

		int[] arr = { 5, 1, 4 };

		// 1. 배열에 계속 원소를 추가하는 방식은 그냥 인터페이스를 이용하는 게 좋을 수 있다.
		// 2. 그럼에도 불구하고 배열로 해결하는 방법을 생각해보면
		// 	  배열의 모든 요소를 순회하고 그 값에 맞는 배열을 새로 만들어야 함
		// 3. 새 배열에 원소를 추가하는 방법은 반복문 두개를 사용해야 할 듯?

		ArrayList<Integer> resultList = new ArrayList<Integer>();
		for (int a : arr) {
            for (int i = 0; i < a; i++) {
                resultList.add(a);
            }
        }
		
		int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
        	answer[i] = resultList.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
