package 배열;

import java.util.ArrayList;
import java.util.HashMap;

public class 문자열_묶기 {

	public static void main(String[] args) {
		// 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
		// 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
		// 제한사항
		// 1 ≤ strArr의 길이 ≤ 100,000
		// 1 ≤ strArr의 원소의 길이 ≤ 30
		// strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
		
		String[] strArr = {"a","bc","d","efg","hi"};
		
		// 1. 원소의 길이를 셀 수 있어야 함
		// 2. 원소 길이별 카운트를 해야 함
		//	  길이별로 묶기 위해선 중복 없는 map  
		// 3. 카운트 중 가장 높은 결과를 반환해야 함
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (String str : strArr) {
			map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
		}
		
		int answer = 0; 
		
		for (int count : map.values()) {
			answer = Math.max(count, answer);
		}
		
		System.out.println(answer);
		
		
		
	}

}
