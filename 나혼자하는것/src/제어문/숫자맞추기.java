package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int target = r.nextInt(99);
		
		for (int i = 0; i < 1; i++) {
			System.out.print("숫자를 입력해주세요. >> ");
			int answer = sc.nextInt();
			if (answer == target) {
				System.out.println("정답입니다!");
				i++;
			} else if(answer < target) {
				System.out.println("정답보다 작습니다!.");
				i--;
			} else if (answer > target ) {
				System.out.println("정답보다 큽니다!.");
				i--;
			}
		}
	}

}
