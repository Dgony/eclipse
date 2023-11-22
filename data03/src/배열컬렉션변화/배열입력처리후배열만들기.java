package 배열컬렉션변화;

import java.util.ArrayList;

import 배열기본.Print;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// 위 목록 중 3의 배수인 숫자들만 모아보자!
		// 결과를 배열에 모아서 출력!
		// 3의 배수가 몇개가 될 지 모름 ==> collection(Arraylist)
		ArrayList<Integer> list = new ArrayList<>();
		
		// 1. for문(배열 순회) + if문(3의 배수 조건) ==> list에 모으기
		for (int x : arr) {
			if (x % 3 == 0) {
				list.add(x);
			}
		}
		
		// 2. 몇 개인지 세어보고, list 목록에도 프린트!
		System.out.println("3의 배수인 숫자는 " + list.size());
		System.out.println("list 목록은 " + list);
		
		// 3. list에 들어있는 것을 꺼내서 answer 배열에 옮겨보자!
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Print.arr(answer);
		
	}

}
