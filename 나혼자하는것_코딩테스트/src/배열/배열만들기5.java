package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기5 {

	public static void main(String[] args) {
		// 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
		// 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다. 
		// 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.

		// 제한사항
		// 0 ≤ s < 100
		// 1 ≤ l ≤ 8
		// 10l - 1 ≤ k < 10l
		// 1 ≤ intStrs의 길이 ≤ 10,000
		// s + l ≤ intStrs의 원소의 길이 ≤ 120
		
		String [] inStrs = {"0123456789","9876543210","9999999999999"};
		int k = 50000;
		int s = 5;
		int i = 5;
		
		// 1. inStrs 배열의 원소가 k 보다 큰 경우를 만족하는 길이의 배열이 필요함
		// 2. 첫번째 방법은 list 없이 배열 순회로 추가 
		// 3. 두번째 방법은 list를 통해 간단히 추가
		
		// 첫번째 방법 
		String sum = "";
		
		for (String str : inStrs) {
			sum += Integer.parseInt(str.substring(s, s + i)) > k ? str.substring(s, s + i) + "," : "";
		}
	
		int[] answer = new int[sum.split(",").length];
		
		for (int j = 0; j < answer.length; j++) {
			answer[j] = Integer.parseInt(sum.split(",")[j]);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		// 두번째 방법 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (String a : inStrs) {
			if (Integer.parseInt(a.substring(s, s + i)) > k) {
				list.add(Integer.parseInt(a.substring(s, s + i)));
			}
		}
		
		int[] result = new int[list.size()];
		
		for (int j = 0; j < result.length; j++) {
			result[j] = list.get(j);
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
