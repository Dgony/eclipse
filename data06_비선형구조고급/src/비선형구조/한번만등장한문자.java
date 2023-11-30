package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public String solution(String s2) {
		String answer = "";
		// 1. String을 list에 하나씩 분리시켜라.
		//    array, list(**)
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i) + "");
		}
		System.out.println(list);
		
		// 2. 어떤 것들이 있는지 목록을 만들어보자!
		//    list중에서 중복을 제거하고 모으면 된다!
		//    set이다!
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		System.out.println(set);
		
		// 몇번씩 나오는지 확인해볼까?
		ArrayList<String> result = new ArrayList<String>();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s3 = it.next();
			int f = Collections.frequency(list, s3);
			System.out.println(s3 + "은 " + f + "만큼 들어있음");
			if (f == 1) {
				result.add(s3);
			}
			
		}
		Collections.sort(result);
		answer = String.join("", result);
		
		return answer;
	}
}