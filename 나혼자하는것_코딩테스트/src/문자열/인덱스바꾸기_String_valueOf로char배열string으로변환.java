package 문자열;

public class 인덱스바꾸기_String_valueOf로char배열string으로변환 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 num1, 
		// num2가 매개변수로 주어질 때, 
		// my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
		
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		
		// 1. string은 replace 말고는 바꿀 수 없음.
		// 2. char배열로 바꾸고 바꿔야 할 듯?
		
		char[] arr = my_string.toCharArray();
		
		char character = arr[num1];
		
		arr[num1] = arr[num2];
		arr[num2] = character;
		
		my_string = String.valueOf(arr);
		
		System.out.println(my_string);

	}

}
