package 부품사용하기;

import 부품만들기.TV;
import 부품만들기.전화기;

public class 우리집 {

	public static void main(String[] args) {
		// 지금 TV라는 클래스를 import해와서 myTV라는 object(instance)를 가져왔다.
		TV myTv = new TV();
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = false;
		
		TV yourTv = new TV();
		yourTv.ch = 7;
		yourTv.vol = 12;
		yourTv.onOff = true;
		
		System.out.println(myTv.ch);
		System.out.println(myTv.vol);
		System.out.println(myTv.onOff);
		
		전화기 p1 = new 전화기();
		p1.size = 11;
		p1.speaker = "바나나사";
		p1.인터넷하다();
		
		전화기 p2 = new 전화기();
		p2.size = 9;
		p2.speaker = "메론사";
		

		System.out.println("사이즈는 " + p1.size + ", 회사는 " + p1.speaker);
		System.out.println("사이즈는 " + p2.size + ", 회사는 " + p2.speaker);
		System.out.println(p1);
		System.out.println(p2);
	}
}
