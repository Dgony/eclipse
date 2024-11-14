package 배열;

import java.util.ArrayList;
import java.util.Arrays;

public class ad제거하기_배열에서가변리스트로변환 {

	public static void main(String[] args) {
		// 	문자열 배열 strArr가 주어집니다. 
		// 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 
		// 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
		
		String[] strArr = {"and","notad","abcd"};
		
		// 1. 'a' 와 'd' 포함이 아니라 "ad" 라서 contains와 함께 쓰면 될 듯
		// 2. strArr의 길이를 기준으로 ad를 계산 후 새 배열의 길이 설정  
		// 3. ad 계산 중 ad를 포함하는 요소는 null로 처리  
		// 4. 새 배열에 요소를 추가할 대 null이 아닌 값만 집어넣기
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("ad")) {
				list.remove(i);
				i--;
			}
		}
		
		String[] answer = new String[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
	}

}
