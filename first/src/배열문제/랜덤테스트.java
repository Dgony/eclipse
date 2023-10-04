package 배열문제;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		// Random 테스트
		Random r = new Random();
		r.setSeed(100);
		int data = 0;
		for (int i = 0; i < 1000; i++) {
			data = r.nextInt(100);
			System.out.println(data);
		}
	}

}
