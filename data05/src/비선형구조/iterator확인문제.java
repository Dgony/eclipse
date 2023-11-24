package 비선형구조;

import java.util.HashSet;
import java.util.Iterator;

import 배열기본.Print;

public class iterator확인문제 {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<Integer>();
		// 일주일간 받았던 용돈(월~일)
		// 1000, 2000, 3000, 2000, 4000, 2000, 3000
		bag.add(1000);
		bag.add(2000);
		bag.add(3000);
		bag.add(2000);
		bag.add(4000);
		bag.add(2000);
		bag.add(3000);
		
		// 일주일간 받았던 용돈 중에서
		// 얼마씩 받았는지 전체 프린트
		System.out.println(bag);
		
		// 1000, 2000, 3000, 4000
		Iterator<Integer> it = bag.iterator();
		for (Integer x : bag) {
			if (it.hasNext()) {
				System.out.println(it.next());
			}
		}		
	}

}
