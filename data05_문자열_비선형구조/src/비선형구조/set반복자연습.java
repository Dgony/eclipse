package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

import 배열기본.Print;

public class set반복자연습 {

	public static void main(String[] args) {
		// set은 꺼내는 기능이 없다. 순서도 없다.
		HashSet<String> set = new HashSet<String>();
		set.add("휴대폰");
		set.add("휴지");
		set.add("휴지");
		System.out.println(set);
		
		// iterator(반복자)
		// set에 있는 값을 하나씩 꺼내려면 반복자를 달아야 한다.
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// array ==> list : Array.asList()
		// list ==> array : list.toArray()
		// set ==> array : set.toArray()
		Object[] arr = set.toArray();
		Print.arr(arr);
	}

}
