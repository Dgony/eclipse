package 제어문.반복문;

import java.util.Random;

public class 랜덤test {

	public static void main(String[] args) {
		Random r = new Random();
		// int target = r.nextInt(); // +-21억
		int target = r.nextInt(100) + 1; // 0부터 지정한 값보다 하나 적게 설정 가능 
		System.out.println(target);
	}

}
