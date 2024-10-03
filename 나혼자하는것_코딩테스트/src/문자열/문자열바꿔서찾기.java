package 문자열;

public class 문자열바꿔서찾기 {

	public static void main(String[] args) {
		// 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. 
		// myString의 "A"를 "B"로, 
		// "B"를 "A"로 바꾼 문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.
		// 1 ≤ myString의 길이 ≤ 100
		// 1 ≤ pat의 길이 ≤ 10
			// myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
		
		String my_string = "ABBAA";
		String pat = "AABB";
		
		// 1. 반복문과 replace를 통해 myString을 바꾸고
		// 2. 포함 여부를 확인하는 contains 메서드를 사용하면 될 듯
		
		// StringBuffer sb = new StringBuffer(my_string);
		// String 배열은 다른 배열처럼 요소를 하나하나 바꾸는 것은 불가능한 불변(immutable) 클래스기 때문에,
		// 이렇게 Stringbuilder를 이용해 교체 가능한 sb를 사용해보았다. 
		// 근데 다시 생각해보니 어차피 변수를 하나 만들어야 한다면 그냥 String 변수를 하나 만들어서 더해야겠다. 
		
		String answer = "";
		for (char x : my_string.toCharArray()) {
			 answer += x == 'A' ? 'B' : 'A';
		}
		
		System.out.println(answer);
		System.out.println(answer.contains(pat));



	}

}
