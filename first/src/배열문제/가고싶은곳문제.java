package 배열문제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 가고싶은곳문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[]
		last = new String[3], year = new String[3];
		
		for (int i = 0; i < year.length; i++) {
			System.out.print("작년에 가고 싶었던 곳을 입력해주세요. >>> ");
			last[i] = sc.next();
		}
		for (int i = 0; i < year.length; i++) {
			System.out.print("올해 가고 싶은 곳을 입력해주세요. >>> ");
			year[i] = sc.next();
		}
		
		int
		change = 0,
		stay = 0;
		for (int i = 0; i < year.length; i++) {
			if (last[i].equals(year[i])) {
				stay++;
			} else {
				change++;
			}
		}
		System.out.println(
				"작년과 올해의 우선순위가 같은 장소는 " + stay + "개고,\n" + 
				"작년과 올해의 우선순위가 다른 장소는 " + change + "개다."
				);
		
		// 1. 작년과 올해에도 가고 싶은 장소가 종일한 것은 몇 개인가?
		// 2. 작년과 올해에 가고 싶은 장소가 달라진 것은 몇 개인가?
		// 1-2) 작년과 올해에도 가고 싶은 장소가 동일한 곳은 어디인가?

	}

}
