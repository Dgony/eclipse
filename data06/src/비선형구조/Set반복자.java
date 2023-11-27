package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("휴지");
		set.add("휴대폰");
		set.add("휴지");
		System.out.println(set);
		Iterator<String> it = set.iterator(); // 반복자를 만들기
		// set은 반복자(iterator)를 이용해서 데이터에 접근할 수 있음.
		String q = "";
		while (it.hasNext()) {
			q = it.next();
			System.out.println(q);
		}

	}

}
