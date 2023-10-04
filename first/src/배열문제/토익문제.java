package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int[]
		답안 = new int[990], 내답 = new int[990];
		Random r = new Random(18);
		
		int score = 0;
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4);
			내답[i] = r.nextInt(4);
			if (답안[i] == 내답[i]) {
				score++;
			}
		}
		
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답));
		
		// 하나 맞을 때 점수가 1점
		// 저는 몇 점일까요?
		System.out.println("저의 점수는 " + score + "점 입니다.");
		
	}

}
