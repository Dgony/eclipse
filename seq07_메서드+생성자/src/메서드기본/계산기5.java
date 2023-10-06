package 메서드기본;

import java.util.ArrayList;
import java.util.HashSet;

public class 계산기5 {
	// 고정된 크기면 배열을 사용
	// 이렇게 가변적 크기는 밑의 컬렉션을 사용
	public ArrayList<Integer> getEven(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x);
			}			
		}
		return list;
	}
	public ArrayList<Integer> getOdd(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 1) {
				list.add(x);
			}			
		}
		return list;
	}
	public HashSet getUnique(int[] num) {
		HashSet list = new HashSet();
		// 중복된 것은 아예 넣지 않음.
		for (int x : num) {
			list.add(x);
		}
		return list;
	}
	
	
}
