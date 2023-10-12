package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 형변환은 상속 관계에서만 가능하다.
		// 가변길이, 타입 여러개일 때 사용
		// 컬렉션을 순서대로 넣기 때문에 데이터 변동이 많을 때는 불편함
		ArrayList list = new ArrayList();
		list.add("나는 String"); // String ==> Object
		list.add(100); // Int(Integer로 기본형 다룸) ==> Object
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		// list에 있는 값을 각각 꺼내서 변수에 넣어봅시다.
		String s = (String)list.get(0); // Object
		
		list.add(new JButton("나는 버튼"));
		
		JButton b1 = (JButton)list.get(2);
		
		System.out.println(list);
		

	}

}
