package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import 배열기본.Print;

public class 우승자투표문제 {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "홍길동",
				"정길동", "조길동", "김길동", "홍길동"};
		// 1. 전체 명단 프린트
		HashMap<String, Integer> name = new HashMap<String, Integer>();
		for (int i = 0; i < all.length; i++) {
			name.put(all[i], name.getOrDefault(all[i], 0) + 1);
		}
		System.out.println(name);
		
		// 2. 각 명단의 사람이 몇 표씩 획득했는가?
		Set<String> keys = name.keySet();
		System.out.println(keys);
		System.out.println(name);
		
		
		// 3. 누가 제일 높은 득표를 했는데? 몇 표인가?
		// HashMap을 이용하고, getOrDefault()함수를 사용하면 편합니다!
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (String key : keys) {
			values.add(name.get(key));
		}
		int max = Collections.max(values);
		System.out.println(max);
		for (String key : keys) {
			if (name.get(key) == 3) {
				System.out.println(key);
			}
		}
//		Collection valuew2 = name.values();
	}

}
