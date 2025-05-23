package 정수;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
		// n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
		// n은 1이상, 50000000000000 이하인 양의 정수입니다.

		int n = 121;
		
		// 1. 제곱근을 판단하는 식이 있을 것으로 추정됨
		// 2. Math.sqrt 를 통해 정수의 제곱근 판단 가능  
		
		long answer = (long) (Math.sqrt(n) % 1 == 0 ? (Math.sqrt(n)+1) * (Math.sqrt(n)+1) : -1);
		
		System.out.println(answer % 1 > 0 ? -1 : answer);
	}

}
