package 정수;

public class 두수의연산값비교하기_parseInt_사칙연산_삼항연산자 {

	public static void main(String[] args) {
		// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

		// 12 ⊕ 3 = 123
		// 3 ⊕ 12 = 312
		// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

		// 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
		
		// 1 ≤ a, b < 10,000
		
		int a = 91;
		int b = 2;
		
		int x = Integer.parseInt(a + "" + b);
		int y = 2 * a * b;
        int answer = x > y ? x : y;
        
        System.out.println(answer);

	}

}
