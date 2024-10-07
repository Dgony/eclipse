package 배열;

import java.util.ArrayList;

public class 콜라츠수열만들기_stream_maptoInt_Integer_intValue {

	public static void main(String[] args) {
		// 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
		// x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
		// 그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
		// 계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부 언젠가 1에 도달한다는 것이 알려져 있습니다.
		// 임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때 초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ n ≤ 1,000
		
		int n = 10;
		
		// 1. 콜라츠 수열을 만들기 위해선 반복문과 조건문 1번씩 작성하면 될 듯?
		// 2. 수열의 모든 수를 기록하는 배열을 만들기 위해선 어떤 규칙성을 발견한거나 인터페이스를 사용해야 할 듯
		
		ArrayList<Integer> resultlist = new ArrayList<Integer>();
		while (n != 1) {
			resultlist.add(n);
			n = n % 2 == 0 ? n / 2 : 3 * n + 1;
		}
		resultlist.add(1);
		
		System.out.println(resultlist.stream().mapToInt(Integer::intValue).toArray());
		System.out.println(resultlist);

	}

}
