package 정수;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {

	public static void main(String[] args) {
		// 함수 solution은 정수 x와 자연수 n을 입력 받아, 
		// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
		// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		// x는 -10000000 이상, 10000000 이하인 정수입니다.
		// n은 1000 이하인 자연수입니다.
		
		int x = -4;
		int y = 2;
		
		// 1. y개 만큼의 길이를 가지는 배열 만들어두기 
		// 2. x값을 누적하면서 y만큼 반복
		
		long[] answer = new long[y];
        answer[0] = x;

        for (int i = 1; i < y; i++) {
            answer[i] = answer[i - 1] + x;
        }
		
		System.out.println(Arrays.toString(answer));

	}

}
