package 컬렉션;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {
		LinkedList que = new LinkedList();
		que.add("국어");
		que.add("수학");
		que.add("영어");
		que.add("컴퓨터");
		System.out.println("전체 시험 볼 과목 : " + que);
		
		for (int i = 1; i < que.size(); i++) {
			que.remove();
			System.out.println(i + "일차 시험 본 후 남은 과목 : " + que);
			i--;
		}
	}

}
