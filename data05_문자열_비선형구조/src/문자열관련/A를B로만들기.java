package 문자열관련;

import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(b);
		Arrays.sort(a);
		
		String answer1 = new String(b);
		String answer2 = new String(a);
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(answer1 + answer2);

	}

}
