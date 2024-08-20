package 문자열;

public class 두수의연산값비교하기 {

	public static void main(String[] args) {
		// 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
		// 12 ⊕ 3 = 123
		// 3 ⊕ 12 = 312
		// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
		// 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
		int a = 2;
		int b = 91;
		
		// 1. a + b 와 2*a*b 를 비교하려면 같은 데이터 타입이어야 한다.  
		// 2. a + b가 문자열 합연산인것으로 보아 합친 후 int로 데이터 타입을 변경하면 비교 가능할 것 같음
		// 3. 왠지 삼항연산자를 사용하면 간단해보일 것 같음.
		int x = Integer.parseInt(a + "" + b);
		int y = 2 * a * b;
		System.out.println(x > y ? x : y);

	}

}
