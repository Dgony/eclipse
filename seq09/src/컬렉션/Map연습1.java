package 컬렉션;

import java.util.HashMap;

public class Map연습1 {

	public static void main(String[] args) {
		// map = 맵핑시키다, 연결시키다.
		// key = 값으 쌍으로 매핑시켜서 연결시켜서 저장함.
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melong", "메론");
		map.put("ice", "아이스크림");
		System.out.println(map);
		System.out.println(map.get("apple"));
		// 순서가 없음.
		map.put("apple", "파란색 사과");
		System.out.println(map);
		map.replace("apple", "노란색 사과");
		System.out.println(map);
	}

}
