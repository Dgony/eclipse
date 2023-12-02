package 배열;

import java.util.Arrays;

public class 삼각형의완성조건_1 {

	public static void main(String[] args) {
		// 삼각형의 세 변의 길이를 제공하는 sides배열 제공
		// 조건 : 가장 긴 변의 길이가 나머지 두 변의 길이의 합보다 작아야 함
		// 세 변으로 삼각형을 만들 수 있다면 1, 없다면 2를 return
		int[] sides = {1, 2, 3};
		
		Arrays.sort(sides);
		int answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
		

	}

}
