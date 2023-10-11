package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class Set연습3 {

	public static void main(String[] args) {
		// 로또 문제
		HashSet lotto = new HashSet();
		// 고정 길이, 같은 타임 ==> 컬렉션보다 배열을 쓰는 것이 더 효과적
		
		// 랜덤하게 만들어서 배열에 6개의 숫자를 넣자.
		Random r = new Random();
		while(true) {
			lotto.add(r.nextInt(45) + 1);
			if (lotto.size() == 6) {
				break;
			}
		}
		System.out.println(lotto);
		// 이렇게 쓰면 중복이 생기더라도 길이 6을 채우고 나오는 문제
	}

}
