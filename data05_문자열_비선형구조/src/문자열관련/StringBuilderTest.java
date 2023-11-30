package 문자열관련;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); // 주소비교
		System.out.println(s.equals(s2));
		// 주소가 가르키는 값이 동일하녀? 비교
		s2 = "hahaha";
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		// String ==> 가르키는 값이 동일하면 같은 주소를 가르킴
		// String의 값이 변할 수 있으면 StringBuilder 클래스 추천
		StringBuilder sb = new StringBuilder("pongpong");
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb == sb2);
		sb.append("hahaha");
		System.out.println(sb);
		String result = sb.toString();
		System.out.println(result);
		sb.replace(0, 3, "ttt");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);

	}

}
