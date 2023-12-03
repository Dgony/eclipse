package 문자열;

public class 숨어있는숫자의덧셈_1 {

	public static void main(String[] args) {
		// 문자열 my_string을 제공한다.
		// my_string 안의 모든 자연수들의 합을 return
		String my_string = "aAb1B2cC34oOp";
		
		
		
		int answer = 0;
		String[] s = my_string.split("");
		char c = (Character) null;
		for (String x : s) {
			if (48 <= c && c >= 57) {
				c = x.charAt(0);
				answer += Integer.parseInt(x);
			}
		}
		System.out.println(answer);

	}

}
