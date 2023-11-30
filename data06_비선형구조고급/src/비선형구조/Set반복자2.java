package 비선형구조;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set반복자2 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		// 1. 뭐가 들어가 있는지 파악해보자!
		// 1-1. s에 들어있는 글자들을 분리시켜야 한다.
		// 1-2. 그 글자들을 중보글 제거한 채 모으면 된다.
		//      set을 이용!!
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		// 비파괴형 함수, 읽기 전용으로 접근만 가능한 방식
		// 값수정이나 길이조정을 하려면 Arraylist등을 새로 만들어야 함
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < s2.length; i++) {
			set.add(s2[i]);
		}
		System.out.println(set);
		
		// 2. 각 값이 몇개씩 들어있는지 세보자!
		Iterator<String> it = set.iterator();
		

	}

}
