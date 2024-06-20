package 배열;

import java.util.Arrays;

public class 배열맛보기 {

	public static void main(String[] args) {
		// 배열을 만드는 2가지 방법
		int[] arr1 = {1, 2, 3, 4}; // 배열에 값을 집어넣어서 선언
		int[] arr2 = new int[20]; // arr2을 int데이터 타입을 가지는 20개짜리 빈 배열로 만듦
		
		System.out.println(arr1);
		System.out.println(arr2);
		// 어? 배열은 분명 1 2 3 4 가 들어가 있는데 왜 이렇게 출력되지?
		// 어? 배열에 내용이 없는데 이상한게 출력되네?
		// 왜냐면 참조형 변수는 생성자를 따로 만들지 않으면 변수의 값을 출력하도록 되어있거든요
		// 측 참조형 변수의 값은 arr1이란 배열의 주소이기 때문에, 주소에 해당하는 값이 출력됨.
		
		double[] height = {123.1, 123.2, 123.3};
		double[] space = new double[500];
		char[] gender = {'남', '여', '남'};
		String[] space2 = new String[200];
		String arrstring = Arrays.toString(height);
		
		System.out.println(Arrays.toString(height));
		System.out.println(arrstring);
		
		int[] arr3 = new int[3];
		// System.out.println(arr3[3]); 배열의 길이로 인한 오류를 발생시키는 코드
		// java.lang.ArrayIndexOutOfBoundsException: 3
		
	}

}
