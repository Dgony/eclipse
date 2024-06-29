package 박싱과언박싱;

import java.util.ArrayList;
import java.util.Random;

public class 컬렉션과박싱 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		// add(Object o) : Object는 모든 클래스의 상위 클래스이기 떄문에, 모든 클래스 o
		// add(참조형 변수의 주소) <== auto boxing add(기본형) 과 같음
		// list1 이라는 컬렉션의 인덱스에는 참조형 변수만 들어갈 수 있음
		// 기본형 데이터 타입인 int 는 들어갈 수 없기 때문에 Integer 로 감싸주는 박싱 과정이 있음
		list1.add(Integer.valueOf(200)); // 수동 박싱
		// JAVA 5 이후는 이 박싱을 자동을 해주는 오토 박싱이 생김
		list1.add(100); // 오토 박싱 - Integer
		
		list1.add(new Random()); // 참조형
		list1.add(true); // 래퍼 Boolean 으로 오토 박싱
		list1.add(11.1); // 래퍼 Dobule 로 오토 박싱
		list1.add('a'); // 래퍼 Charater 로 오토 박싱
		
		System.out.println(list1);

	}

}
