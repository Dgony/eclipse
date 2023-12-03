package 문자열;

public class 특정문자를대문자로바꾸기 {

	public static void main(String[] args) {
		// 영어 소문자로 이루어진 문자열 my_string 제공하고,
		// 문자 1개로 이루어진 문자열 alp를 제공할 때, 
		// my_string에서 alp에 해당하는 문자를 모두 대문자로 바꾸기
		String my_string = "programmers";
		String alp = "p";
		
		String answer = "";
		String[] s = my_string.split("");
		for (String x : s) {
			if (x.equals(alp)) {
				answer += x.toUpperCase();
			} else {
				answer += x;
			}
		}
		System.out.println(answer);

	}

}
