package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class String정리문제 {

	public static void main(String[] args) {
		// 1. 0~899범위의 랜덤한 값 20개를 빈 배열에 넣고, 최대값 구하기
		Random r = new Random();
		int [] list = new int [20];
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(900);
		}
		int max = list[0];
		for (int x : list) {
			if (x > max) {
				max = x;
			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		
		// 2. String 두 문자열이 동일한지, 글자수 어느쪽이 큰지 프린트
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println("String s1과 s2는 동일한가? >> "
		+ (s1.equals(s2)));
		if (s1.length() > s2.length()) {
			System.out.println("String s1 글자수가 더 많다.");
		} else if (s1.length() < s2.length()) {
			System.out.println("String s2 글자수가 더 많다.");
		}
		
		// 3. String s3 = "나는 진짜 java programmer가 되었어"
		// 에서 "java programmer"만 추출하여 모두 대문자로 프린트
		String s3 = "나는 진짜 java programmer가 되었어";
		System.out.println(s3.substring(6, 21).toUpperCase());
		
		// 4. String에서 2만 추출해서 1인 경우 남자, 2인 경우 여자
		String s4 = "2056521";
		char c = s4.charAt(0);
		if (c == '2' || c == '4') {
			System.out.println("여자임");
		} else {
			System.out.println("남자임");
		}
		
		String s5 = "[   20, 10, 50, 40, 30]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		System.out.println(s5);
		s5 = s5.trim();
		System.out.println(s5);
		String[] s6 = s5.split(", ");
		Print.arr(s6);
		
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
		}	
		System.out.println(sum);
		
		int [] newarr = new int[s6.length];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = Integer.parseInt(s6[i]);
		}
		Print.arr(newarr);
		Arrays.sort(newarr);
		Print.arr(newarr);
		
		String s10 = "정길동";
		String s20 = "정길동";
		System.out.println(s10 == s20);
		s10 = "홍길동";
		System.out.println(s10 == s20);
		System.out.println(s10.equals(s20));
		
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		System.out.println(sb);
		sb.insert(0, "하하하");
		System.out.println(sb);
		
		String s30 = "푸하하굿바이";
		char[] c2 = s30.toCharArray();
		Print.arr(c2);
		
		
	}

}
