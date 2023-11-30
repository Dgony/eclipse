package 문자열관련;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc"};
		// 컬렉션이 배열에 비해 함수가 풍부하다.
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		
		// 읽기 전용의 list로 변환이 가능.
		int index = list.indexOf("bbb");
		System.out.println(index);
		boolean result = list.contains("ccc");
		System.out.println(result);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
