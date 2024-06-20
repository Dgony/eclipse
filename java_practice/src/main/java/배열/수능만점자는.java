package 배열;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자는 {

	public static void main(String[] args) {
		// 수능만점자는 10000명의 점수를 배열에 정리(0~450)
		// 1. 만점자가 몇명인지?
		// 2. 0점이 몇명인지?
		// 3. 평균이 어떻게 되었는지?
		// 4. 평균보다 +-50점인 학생 카운트
		
		int[] arr1 = new int[10000];
		int max = 0;
		int min = 0;
		int sum = 0;
		Random r = new Random();  
		
		for (int i = 0; i < arr1.length; i++) { 
			arr1[i] = r.nextInt(451);
		} // 수능 점수를 채워주는 반복문
		
		for (int i : arr1) {
			switch (i) {
			case 450 :
				max++;
				break;
			case 0 : 
				min++;
				break;
			default:
				break;
			}
		} // 만점자와 빵점자를 구분하는 반복문
		 
		for (int i : arr1) {
			sum += i;
		}
		double avg = sum / arr1.length;
		// 평균을 구하는 코드
		
		int plus = 0;
		int minus = 0;
		for (int i : arr1) {
			if (i >= avg + 50) {
				plus++;
			} else if (i <= avg - 50) {
				minus++;
			}
		}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("만점자는 " + max + "명");
		System.out.println("빵점자는 " + min + "명");
		System.out.println("올해 수능 평균 점수는 " + avg);
		System.out.println("평균 점수보다 50점 이상 맞은 사람은 " + plus);
		System.out.println("평균 점수보다 50점 이상 부족한 사람은 " + minus);

	}

}
