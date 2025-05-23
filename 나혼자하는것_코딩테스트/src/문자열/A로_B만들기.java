package 문자열;

import java.util.Arrays;

public class A로_B만들기 {

	public static void main(String[] args) {
		// 문자열 before와 after가 매개변수로 주어질 때, 
		// before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
		// 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
		// 0 < before의 길이 == after의 길이 < 1,000
		// before와 after는 모두 소문자로 이루어져 있습니다.
		
		String before = "olleh";
		String after = 	"hello";
		
		// 1. 순서를 바꿔서 가능하냐는 질문은 아나그램이 가능하냐 인 것 같음  
		// 2. 둘 다 배열로 만들어서 정렬하면 같아짐
		
		char[] arr1 = before.toCharArray();
		char[] arr2 = after.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		arr1.equals(arr2); 
	}

}
