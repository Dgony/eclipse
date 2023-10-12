package 형변환개념;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		System.out.println(me);
		
		int money = (Integer)me.get(0) + 2000;
		double height = (Double)me.get(1) + 10;
		boolean breakfast = (Boolean)me.get(2);
		char gender = (Character)me.get(3);
		
		String breakfast2 = breakfast ? "배룰러요" : "배고파요";
		String joo = gender == '남' ? "1,3" : "2,4";
		
		System.out.println(money);
		System.out.println(height);
		System.out.println(breakfast2);
		System.out.println(joo);
		
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		

	
	}

}
