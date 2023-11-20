package 배열기본;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 배열과리스트에넣기확인문제 {

	public static void main(String[] args) {
		int[] n = {100, 200, 300, 400, 500};
		
		// 1. 전체 목록 프린트
		Print.arr(n);
		
		// 2. 300이상 값이 몇 개인지 카운트해서 프린트
		// 3. 300이상 들어있는 위치를 arraylist에 모으세요.
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count++;
				list.add(i);
			}
		}
		System.out.println("300이상 값은 " + count + "개");
		
		// 4. arraylist안 인덱스의 배열의 값들에서 100만큼 빼주세요.
		for (Integer x :list) {
			n[x] -= 100;
		}
		
		// 5. 수정된 배열 전체 프린트
		Print.arr(n);	

	}

}
