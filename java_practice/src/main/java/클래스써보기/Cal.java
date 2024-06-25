package 클래스써보기;

import java.util.ArrayList;
import java.util.HashSet;

public class Cal {

	public ArrayList<Integer> getEven(int[] num) {
		// 배열의 값 중 짝수만 골라서 list에 넣어 리턴, ArrayList<Integer)사용 
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				list.add(num[i]);
			}
		}
		return list;
	}
	
	public  ArrayList<Integer> getOdd(int[] num) {
		// 배열의 값 중 홀수만 골라서 list에 넣어 리턴, ArrayList<Integer>사용
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				list.add(num[i]);
			}
		}
		return list;
	}
	
	public HashSet<Integer> getUnique(int[] num) {
		// 배열의 값 중 중복된 값을 없앤 목록을 리턴, HashSet<Integer>사용
		HashSet<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
				list.add(num[i]);
		}
		return list;
	}
	
}
