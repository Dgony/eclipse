package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 배열입력배열반환_가변길이 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 40;
		Solution4 s = new Solution4();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution4 {
	public int[] solution(int[] n, int find) {
		// 조건에 만족하는 값들의 리스트가 몇개가 될지는 모르겠음.
		// 가변길이 ==> 조건에 맞는 리스트를 모으고
		// 나중에 모은 데이터를 배열로 옮기면 된다.
		// 가변길이 리스트를 모으기 위한 부품이 필요!
		// 배열은 x(고정길이), Arraylist o(가변길이)
		// 배열의 길이는 반드시 1이상임.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 배열에 있는 값들을 반복문을 통해 하나씩 꺼낸 후
		// find에 40보다 큰 값인지 조건을 검색해서
		// 맞으면 list.add(값);
		for (int i = 0; i < n.length; i++) {
			if (n[i] > find) {
				list.add(n[i]);
			}
		}
		
		// 배열로 옮기자!
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}