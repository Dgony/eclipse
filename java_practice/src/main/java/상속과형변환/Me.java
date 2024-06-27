package 상속과형변환;

import java.util.ArrayList;
import java.util.Arrays;

public class Me {
	
	public static void main(String[] args) {
		// list에 이름, 나이, 시력, 아침여부, 성별 넣기
		ArrayList list1 = new ArrayList();
		list1.add("홍길동");
		list1.add(30);
		list1.add(0.6);
		list1.add(true);
		list1.add('남');
		
		System.out.println(list1);
		
		for (Object x : list1) {
			System.out.println(x);
		}
		
		System.out.println("나의 이름은 " + list1.get(0));
		System.out.println("내년에 내 나이는 " + list1.get(1));
		System.out.println("내 시력은 " + list1.get(2));
		System.out.println("내 성별은 " + list1.get(3) + "입니다.");
		
	}

	
	
}
