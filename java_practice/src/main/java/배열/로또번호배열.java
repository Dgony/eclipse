package 배열;

import java.util.Arrays;
import java.util.Random;

public class 로또번호배열 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(lotto));

	}

}
