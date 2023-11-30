package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		// 배열은 많은 양의 데이터를 다루기 위한 자료구조
		
		// 1. 배열을 만들 때 이미 값들을 알고 있는 경우
		//    선형구조로 값을 쭉 집어넣으면 됨
		int[] ages = {60, 50, 30, 20, 10};
		
		// 배열에 있는 값을 확인하기!! 방법은 세가지.
				// 첫번쨰 일일이 뽑기
				System.out.println(ages);
				System.out.println(ages.length);
				System.out.println(ages[0]);
				ages[1] = 55;
				System.out.println(ages[1]);
				// 두번쨰 for, for each 문으로 뽑기
				// for-each = 값 출력용도로만 사용 가능
				for (int i = 0; i < ages.length; i++) {
					System.out.println(ages[i]);
				}
				for (int x : ages) {
					System.out.println(x);
				}
				// 세번째 Arrays.toString()으로 뽑기
				System.out.println(Arrays.toString(ages));
		
		
		// 2. 배열을 만들 때 아직 값을 모르고 있는 경우
		//    저장공간을 일단 먼저 만들고 나중에 값을 집어 넣음
		double[] weight = new double[5]; // {0.0,0.0,0.0,0.0,0.0};
		weight[0] = 88.8;
		weight[1] = 88.7;
		weight[2] = 88.6;
		weight[3] = 88.5;
		weight[4] = 88.4;
		
		System.out.println(Arrays.toString(weight));
		

	}

}
