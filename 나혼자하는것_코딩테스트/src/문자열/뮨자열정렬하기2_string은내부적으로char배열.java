package 문자열;

import java.util.Arrays;

public class 뮨자열정렬하기2_string은내부적으로char배열 {

	public static void main(String[] args) {
		// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, 
		// my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
		// 0 < my_string 길이 < 100
		
		String my_string = "heLLo";
		
		// 1. toLowerCase와 정렬을 사용하면 될 듯
		// 2. 문자열에 정렬이 사용되는지 알 수 없으나 일단 시도해보고 안되면 반복문 사용 
		
		my_string.toLowerCase();
		
		String[] str = my_string.split("");
		Arrays.sort(str);
		my_string = "";
		
		for (int i = 0; i < str.length; i++) {
			my_string += str[i];
		}
		
		System.out.println(my_string);
		
		// 생각도 못한 풀이  
		//public String solution(String my_string) {
	        //char[] c = my_string.toLowerCase().toCharArray();
	        //Arrays.sort(c);
	        //return new String(c);
	    //}
		
		// String이 내부적으로 char 배열로 이루어져 있다는 사실을 알고 있었지만,
		// return에서 String 객체 생성을 char 배열로 할 수 있다는 사실 간과했음.  
		// 또한 string이 내부적으로 char 배열로 이루어져 있기 때문에 
		// char 배열에 string 메서드를 사용한 결과를 담는 데이터를 넣을 수 있다는 사실도 지나쳐버림.
		
	}

}
