package 배열;

import java.util.Arrays;

public class 배열만들기3 {

	public static void main(String[] args) {
		// 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
		// intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다. 
		// 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
		// 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
		
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
		
		// 1. 예시의 결과를 보았을 때 substring에 interval의 이차원배열 값을 그대로 넣으면 될 듯 
		// 2. 결과 배열은 interval의 a2 - (a1-1), b2 - (b1-1) 만큼의 길이로 설정
		
		int[] answer = new int[intervals[0][1] - (intervals[0][0]-1) + intervals[1][1] - (intervals[1][0]-1)];
		
		int idx = 0;
		for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				answer[idx] = arr[j];
				idx++;
			}
		}
		
		System.out.println(Arrays.toString(answer));

		
	}

}
