package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

import org.apache.taglibs.standard.tag.common.core.RemoveTag;

public class 컬렉션맛보기 {

	public static void main(String[] args) {
		// List - ArrayList 
		ArrayList list1 = new ArrayList();
		list1.add("박소정");
		list1.add("김정민");
		list1.add("소지현");
		list1.add("김개념");
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		list1.remove(2);
		System.out.println(list1);
		
		// Queue - LinkedList
		LinkedList list2 = new LinkedList();
		list2.add("어제 먹은 우유");
		list2.add("오늘 먹은 우유");
		list2.add("내일 먹을 우유");
		System.out.println(list2);
		list2.remove(); // FIFO
		System.out.println(list2);
		
		// Set - HashSet
		// ArrayList와 비교로 중복 테스트
		Random r = new Random();
		ArrayList list3 = new ArrayList();
		HashSet list4 = new HashSet();
		for (int i = 0; i < 6; i++) {
			list3.add(r.nextInt(20));
			list4.add(r.nextInt(20));
		}
		System.out.println(list3); // ArrayList == 중복 O 
		System.out.println(list4); // Set = 중복 X
		list3.remove(0);
		list4.remove(0);
		System.out.println(list3);
		System.out.println(list4);
		
		// Map
		HashMap map = new HashMap();
		map.put("String", "apple");
		map.put("number", 5);
		map.put("double", 11.1);
		map.put("char", '영');
		map.put("boolean", true);
		map.put(1, "1등");
		map.put(12.1, 'c');
		System.out.println(map);
		map.remove("boolean");
		System.out.println(map);

	}

}
