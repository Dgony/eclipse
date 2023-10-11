package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습 {

	public static void main(String[] args) {
		// 순서가 있는 데이터를 모으고 싶을 대
		// 배열??? 컬렉션??? 중에서 컬렉션-리스트 형태를 쓴다.
		// 85%가 list를 사용
		ArrayList list = new ArrayList();
		
		// Collection 상속 ==> add(),....		
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add("a");
		list.add("hong");
		list.add("hong"); // 같은 값을 넣어도 Arraylist는 들어간다.
		list.add(new Button());
		System.out.println(list); //toString()
		// ArrayList안에 toString()이 재정의 (오버라이드 되었음)
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		// hong을 꺼내서 gildong을 붙여 프린트
		// for문을 이용해서 하나씩 꺼내와 모든 데이터를 아래와 같이 프린트
		// for문, for-each문 둘 다 사용 가능!
		// "값 >> " + 100
		System.out.println(list.get(4) + " gildong");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		for (Object x : list) {
			System.out.println("값 >> " + x);
		}
		
		System.out.println(list.contains("hong"));
		list.remove(0); // 파괴형함수
		list.remove(11.1); // 컬렉션의 내용을 써도 삭제가 되네?
		list.add(0, "추가"); // 0번 앞에 넣으라는 명령어
		System.out.println(list);
	}

}
