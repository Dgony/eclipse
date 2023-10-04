package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// 수능으로 10000명의 점수를 처리!
		Random r = new Random(18);

		int[] people = new int[10000];
		
		// 평균을 위한 합산 값
		int sum = 0;
		for (int i : people) {
			sum += i;
		}
		System.out.println("평균 점수는 " + (double) sum / people.length);
		Arrays.sort(people);
		// 이렇게 오름차순 정렬 후에 배열의 처음과 마지막 값을 추출하면 최솟값 최댓값을 할 수 있다 
		int min = people[0];
		int max = people[people.length - 1];
		System.out.println("최소값 >>> " + min);
		System.out.println("최댓값 >>> " + max);
		
		int maxc = 0;
		int minc = 0;
		for (int i = 0; i < people.length; i++) {
			people[i] = r.nextInt(451);
			if (people[i] == max) {
				System.out.println("만점자 : " + i + "번 수험생");
				maxc++;
			} else if (people[i] == min) {
				System.out.println("0점자 : " + i + "번 수험생");
				minc++;
			}
		}
		System.out.println("만점자는 " + maxc + "명, 0점자는 " + minc + "명");
		
		// 300점 이상인 사람의 수를 카운트
		int thr = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i] >= 300) {
				thr++;
			}
		}
		System.out.println("300점 이상인 사람은 " + thr + "명");
	}

}

