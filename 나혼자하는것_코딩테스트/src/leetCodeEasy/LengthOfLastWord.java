package leetCodeEasy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		// 단어와 공백으로 구성된 문자열이 주어질 때, 
		// 공백으로 나눠지는 가장 마지막 단어의 길이를 구하여라  
		
		String s = "Hello World!"; 
		
		// 1. split을 활용하 가장 마지막 요소의 길이를 재면?  
		
		System.out.println(s.split(" ")[s.split(" ").length - 1].length());

	}

}
