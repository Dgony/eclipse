package 정수;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수구하기_정수의약수를배열로만들기 {

	public static void main(String[] args) {
		// 정수 n이 매개변수로 주어질 때,
		// n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		// 1 ≤ n ≤ 10,000
		
		int n = 24;
		
		// 1. 미리 컬렉션을 통해 list를 만들어 두고
		// 2. 반복문을 통해 i부터 정수 n까지 올라가면서,
		//    정수 n % i 가 0인 경우만 배열에 집어넣으면 될 듯
		// 3. 마지막으로 컬렉션을 배열로 변환하면 끝
		
		// list 미리 만들기
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 약수 구하기
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		
		// ArrayList를 int[]로 바꾸는 과정
		int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);  // Integer 값을 int로 언박싱
        }
        
        // 위와 동일한 과정을 java 8 이후 추가된 stream으로 실행하는 과정
        // int[] answer = list.stream().mapToInt(i -> i).toArray();

		System.out.println(Arrays.toString(answer));
        
	}

}
