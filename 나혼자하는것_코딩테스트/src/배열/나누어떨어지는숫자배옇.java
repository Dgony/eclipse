package 배열;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배옇 {

	public static void main(String[] args) {
		// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		// arr은 자연수를 담은 배열입니다.
		// 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
		// divisor는 자연수입니다.
		// array는 길이 1 이상인 배열입니다.
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		// 1. 나누어 떨어지는 경우 판단 후 String에 누적
		// 2. 이후 새 배열에 할당  
		
		ArrayList<Integer> resultList = new ArrayList<>();
        
        // divisor로 나누어 떨어지는 값들을 찾기
        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }
        
        Collections.sort(resultList);
        
        
        // ArrayList를 배열로 변환
        resultList.stream().mapToInt(i -> i).toArray();
        
        
        
	}

}
