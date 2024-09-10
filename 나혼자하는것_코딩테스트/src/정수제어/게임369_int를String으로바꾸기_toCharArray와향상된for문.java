package 정수제어;

public class 게임369_int를String으로바꾸기_toCharArray와향상된for문 {

	public static void main(String[] args) {
		// 머쓱이는 친구들과 369게임을 하고 있습니다.
		// 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
		// 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
		// 1 ≤ order ≤ 1,000,000
		
		int order = 29423;
		
		// 1. 문자열을 하나씩 탐색
		// 2. 탐색하며 answer값에 박수를 쳐야하는 횟수 누적
		// 3. 아마 향상된 for문과 toCharArray 메서드를 사용하면 될 듯
		
		int answer = 0;
		
		for (char x : (order + "").toCharArray()) {
			switch (x) {
			case '3':
				answer ++;
				break;
			case '6':
				answer ++;
				break;
			case '9':
				answer ++;
				break;
			default:
				break;
			}
		}
		
		System.out.println(answer);

	}

}
