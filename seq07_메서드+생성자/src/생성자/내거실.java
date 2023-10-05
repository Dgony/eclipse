package 생성자;

import javax.swing.JButton;

import 부품만들기.TV;

public class 내거실 {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.ch = 5;
		tv.onOff = false;
		tv.vol = 100;
		
		TV2 tv2 = new TV2(6, true, 200);
		
		
		System.out.println(tv);
		System.out.println(tv2);
	}

}
