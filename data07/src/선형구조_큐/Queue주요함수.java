package 선형구조_큐;

import java.util.LinkedList;

public class Queue주요함수 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.get(queue.size() - 1));
		System.out.println(queue.isEmpty()?1:0);
		try {
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
		} catch (Exception e) {
			System.out.println("-1");
		}
		System.out.println(queue.size());

	}

}
