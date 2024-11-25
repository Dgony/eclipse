package 문자열;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {

	public static void main(String[] args) {
		// 문자열 myString이 주어집니다. 
		// "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 
		// 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
		// 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
		
		// 1. 일단 지문만 읽어보면 split x로 문자열을 분리한 뒤
		// 2. 정렬 메서드를 사용하면 되는 것처럼 말함.
		// 3. 빈 문자열을 반환하지 않는다는 것은 x 이외에 띄어쓰기가 있다는 얘기이므로, 
		//    split 메서드 없이 일일이 분리한 뒤 모시깽
		
		String myString = "dxccxbbbxaaaa";
		
		String[] answer = myString.split("X");
		
		Arrays.stream(answer)
         .filter(s -> !s.isEmpty()) 
         .sorted()                 
         .toArray(String[]::new);  
		
		System.out.println(Arrays.toString(Arrays.stream(answer)
		         .filter(s -> !s.isEmpty()) 
		         .sorted()                 
		         .toArray(String[]::new));

	}

}
