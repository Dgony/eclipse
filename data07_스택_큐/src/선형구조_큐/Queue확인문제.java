package 선형구조_큐;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {
		// Queue 활용해서 풀어보세요.
		String[] wait = {"홍길동", "김길동", "송길동", "정길동", "박길동", "이길동"};
		
		// 1. 햄버거를 먹기 위해 웨이팅을 건 명단입니다.
		//    앞 두 사람이 햄버거를 먹고 그 다음 사람은 노쇼해셔
		//    웨이팅이 마지막으로 밀렸습니다. 현재 웨이팅 명단 프린트
		LinkedList<String> queue = new LinkedList<String>();
		for (int i = 0; i < wait.length; i++) {
			queue.push(wait[i]);
		}
		System.out.println(queue);
		queue.remove(queue.size() - 1);
		queue.remove(queue.size() - 1);
		System.out.println(queue);
		queue.push(queue.remove(queue.size() - 1));
		System.out.println(queue);
		
		// 2. 이제 노쇼한 사람 다음 사람이 햄버거를 먹었고
		//    그 다음 사람이 노쇼를 해서 웨이팅이 맨 뒤로 밀렸습니다.
		//    현재 웨이팅 명단 인원을 프린트
		queue.remove(queue.size() - 1);
		queue.push(queue.remove(queue.size() - 1));
		System.out.println(queue);

	}

}
