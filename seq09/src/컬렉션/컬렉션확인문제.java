package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
		HashSet set = new HashSet();
		while (set.size() != 5) {
			System.out.print("가고 싶은 여행지를 입력해주세요. >> ");
			set.add(sc.next());
		}
		System.out.println(set);
		
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.replace("거실", "첵상");
		System.out.println(map);
		
		ArrayList list = new ArrayList();
		list.add("밥먹기");
		list.add("산책하기");
		list.add("잠자기");
		list.add("운동하기");
		list.add("게임하기");
		System.out.println(list);
		list.set(1, "청소");
		System.out.println(list);

	}

}
