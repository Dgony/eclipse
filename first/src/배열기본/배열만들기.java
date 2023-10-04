package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들 때 기준 - 값을 모르고 있는 경우
		int[] s1 = new int[5]; // 자동 초기화 {0,0,0,0,0} 요련 형태

		// 2. 배열 만들 때 기준 - 값을 이미 알고 있는 경우
		int[] s2 = { 1, 2, 3, 4, 5 };
		
		// s1이 가리키고 있는 첫번째 값에다가 100을 넣어보자.
		s1[0] = 100;
		// s1이 가리키고 있는 세번째 값에다가 200을 넣어보자.
		s1[2] = 200;
		// s1이 가리키고 있는 마지막 값에다가 300을 넣어보자.
		s1[s1.length - 1] = 300;
		
		// s1와 s2의 개수(사이즈, 길이)를 프린트하기
		System.out.println(s1.length);
		System.out.println(s2.length);
		
		// s1가 가르키는 첫번째 값 프린트
		System.out.println(s1[0]);
		
		// s1가 가르키는 세번째 값 프린트
		System.out.println(s1[2]);
		
		// s1가 가르키는 마지막 값 프린트
		System.out.println(s1[s1.length-1]);
		
		// s1이 가리키고 있는 첫번째 값과 세번째 값을 더해서 프린트
		int result = s1[0] + s1[2];
		System.out.println(result);
		// s1이 가리키고 있는 첫번째 값과 세번째 값이 동일한지 프린트
		System.out.println(s1[0] == s1[2]);
		
		for (int i : s2) {
			System.out.println(i);
		}
	}

}
