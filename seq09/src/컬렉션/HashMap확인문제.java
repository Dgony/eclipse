package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {
		// 고객관리 시스템에서 100번의 고객은 김데이, 200번의 고객은 김사전,
		// 300번의 고객은 김구조, 400번의 고객은 김자료
		// 200번 고객은 탈퇴, 300번 고객은 개명(김충성)
		// ==> 고객 전체 리스트를 프린트
		HashMap map = new HashMap();
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		System.out.println(map);
		System.out.println("200번의 고객은 탈퇴, 300번의 고객은 개명 >> 김충성");
		map.remove(200);
		map.replace(300, "김충성");
		System.out.println(map);
		map.put(300, "김돌격");
		System.out.println(map);

	}

}
