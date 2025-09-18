package leetCodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		
		// 주어진 정수 배열 digits로 큰 정수를 표현하고,
		// 이때 digits[i]는 큰 정수의 첫번째 자릿수를 나타낸다.  
		// 가장 큰 자릿수부터 작은 자릿수 순서대로 좌 - 우로 정렬되며, 큰 정수는 0으로 시작하지 않는다. 
		// 큰 정수를 1 증가시키고 해당 정수를 배열로 반환하여라. ({4, 3, 1, 2} ==> {4, 3, 1, 3})
		
		int[] digits = {8,9,9,9};
		
		// 1. 그냥 마지막 요소에 1 추가하고 반환하면 되는 것 아닌가? 뭐지?
		//    아 10이 되는 경우가 있으니까?
		// 2. 그럼 정수로 변환 후 계산해서 배열을 만드는 것과
		//    배열을 그대로 두고 계산하는 것 중 어떤 것이 더 빠를까?
		// 3. 마지막 요소 찾아 + 1 / 10의 나머지가 0이면 0으로 바꾸고 / 그 전 요소 + 1
		//    정수를 만들어 더하고 다시 배열하는 것보다 깔끔, 하지만 배열의 길이가 늘어나는 경우라면? 
		// 4. 배열의 길이가 늘어나는 경우는 무조건 9인 경우뿐 
		//    고로 마지막 요소가 9라면 그냥 정수로 바꿔서 더하는 것이 더 좋은 방법일 수도 있지. 
		// 5. 마지막 요소가 9라면 정수로 바꿔서 계산, 아니라면 그냥 + 1 
		
		if (digits[digits.length - 1] != 9) {
			digits[digits.length - 1] += 1;
			
		} else {
			
			for (int i = digits.length - 1; i > 0; i--) {
				if (digits[i] == 9 || digits[i] == 10) {
					digits[i] = 0;
					digits[i - 1] += 1;
				} else {
					i = 0;
					System.out.println(Arrays.toString(digits));
				}
			}
			
			int[] result = new int[digits.length + 1];
			result[0] = 1;
			for (int i = 1; i < result.length; i++) {
				result[i] = 0;
			}
			
			
			
			
		}
		

	}

}
