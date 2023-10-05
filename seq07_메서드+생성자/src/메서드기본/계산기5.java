package 메서드기본;

import java.util.ArrayList;

public class 계산기5 {
	
	public ArrayList<Integer> getEven(int[] num) {
		// 고정된 크기면 배열을 사용
		// 이렇게 가변적 크기는 밑의 컬렉션을 사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x);
			}			
		}
		return list;
	}
	
}
