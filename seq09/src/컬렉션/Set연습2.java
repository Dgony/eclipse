package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Set연습2 {

	public static void main(String[] args) {
		// 로또 문제
		ArrayList lotto = new ArrayList();
		// 고정 길이, 같은 타임 ==> 컬렉션보다 배열을 쓰는 것이 더 효과적
		
		// 랜덤하게 만들어서 배열에 6개의 숫자를 넣자.
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45) + 1); // ==> 0~45까지 들어감
		}
		System.out.println(lotto);
	}

}
