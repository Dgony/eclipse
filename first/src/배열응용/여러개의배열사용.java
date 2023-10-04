package 배열응용;

import java.util.Arrays;

public class 여러개의배열사용 {

	public static void main(String[] args) {
		String[] 식구 = { "아버지", "어머니", "형", "나", "동생" };
		int[] 나이 = { 100, 99, 88, 77, 55 };
		double[] 키 = { 199.9, 189.9, 179.9, 169.9, 159.9 };
		
		System.out.println(식구[0] + " " + 나이[0] + " " + 키[0]);
		System.out.println(식구[4] + " " + 나이[4] + " " + 키[4]);
		
		
		System.out.println(
				"==========================\n" + 
				"=======우리 집 식구 정리=======\n" + 
				"=========================="				
				);
		// 반복문을 이용해서 우리 가족 찍어내기		
		
		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
		
		// 우리 가족 내년 나이 + 1
		for (int i = 0; i < 키.length; i++) {
			나이[i]++;
		}
		System.out.println(Arrays.toString(나이));
	}

}
