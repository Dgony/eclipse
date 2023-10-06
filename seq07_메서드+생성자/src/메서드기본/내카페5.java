package 메서드기본;

import java.util.ArrayList;
import java.util.HashSet;

public class 내카페5 {

	public static void main(String[] args) {
		계산기5 cal5 = new 계산기5();
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		ArrayList<Integer> list1= cal5.getEven(num);
		ArrayList<Integer> list2 = cal5.getOdd(num);
		HashSet list3 = cal5.getUnique(num);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

}
