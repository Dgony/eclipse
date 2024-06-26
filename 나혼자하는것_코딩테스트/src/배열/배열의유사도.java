package 배열;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		// 두 배열 s1, s2가 주어졌을 때
		// s1과 s2의 같은 원소의 갯수를 return하는 solution함수 완성
		
		// 1. 배열간 유사도를 비교해야 한다. 아마 관련 메서드가 있었는데?
		int answer = 0;
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s2[i].equals(s1[j])) {
					answer += 1;
				}
			}
		}
		
		System.out.println(answer);

	}

}
