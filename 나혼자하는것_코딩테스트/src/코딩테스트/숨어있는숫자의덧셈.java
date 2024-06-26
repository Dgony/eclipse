package 코딩테스트;

import java.util.Arrays;

public class 숨어있는숫자의덧셈 {

	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		String[] arr1 = my_string.split("");

		int answer = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if (arr1[i].matches("\\d")) {
				answer += Integer.parseInt(arr1[i]);
			}
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(answer);
	}

}
