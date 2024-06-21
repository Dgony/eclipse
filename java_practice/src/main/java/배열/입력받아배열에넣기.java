package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		// 1. 작년에 가고 싶었던 곳
		Scanner sc = new Scanner(System.in);
		String[] trip1 = new String[3];
		for (int i = 0; i < trip1.length; i++) {
			System.out.print("작년에 가고 싶던 " + (i+1) + "번 여행지를 입력해주세요. >> ");
			trip1[i] = sc.next();
		}
		
		// 2. 올해 가고 싶은 곳
		String[] trip2 = new String[3];
		for (int i = 0; i < trip2.length; i++) {
			System.out.print("올해 가고 싶은 " + (i+1) + "번 여행지를 입력해주세요. >> ");
			trip2[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(trip1));
		System.out.println(Arrays.toString(trip2));

	}

}
