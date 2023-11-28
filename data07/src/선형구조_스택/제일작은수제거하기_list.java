package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기_list {

	public static void main(String[] args) {
		int[] n = {4, 3, 2, 1, 5};
		
		// 리스트로 변환시켜서
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
				list.add(n[i]);
		}
		System.out.println(list);
		
		// 최소값을 찾아라
		int min = Collections.min(list);
		System.out.println(min);
		
		// 최소값을 지우세요.
		list.remove(list.indexOf(min));
		System.out.println(list);
		
		// 배열에 옮기자
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
