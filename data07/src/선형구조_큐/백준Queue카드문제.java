package 선형구조_큐;

import java.util.LinkedList;

public class 백준Queue카드문제 {

	public static void main(String[] args) {
		int x = 6; // x이하 숫자를 que로 만들기
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i <= 6; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		
		for (int i = 0; i < queue.size(); i++) {
			// 1개 버리고
			queue.remove();
			// 하나 빼서 맨 뒤로 붙이고
			queue.add(queue.remove());
			System.out.println(queue);
		}
		
		System.out.println(queue.remove());
		System.out.println(queue);

	}

}
