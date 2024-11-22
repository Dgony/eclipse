package 정수;

public class 두정수사이의합_등차수열 {

	public static void main(String[] args) {
		// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		// 예를 들어 a = 3, b = 5인 경우, 
		// 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		// a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
		// a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
		
		int a = 3;
		int b = 6;
		
		// 1. 임의의 결과값 변수를 만든다.
		// 2. a ~ b 만큼을 반복하는 반복문을 생성해 누적
		// 3. a와 b사이간 대소 관계가 없기 때문에 두 수의 크기를 판단한는 것이 중요
		
		int answer = 0;      
		
		if (a > b) {
			int x = a;
			a = b;
			b = x;
		}
		
		for (int i = a; i <= b; i++) {
			answer += i;
		}
		
		System.out.println(answer);
		
		
		
		// 인상깊은 풀이 
		  //public long solution(int a, int b) {
		        //return sumAtoB(Math.min(a, b), Math.max(b, a));
		    //}

		    //private long sumAtoB(long a, long b) {
		        //return (b - a + 1) * (a + b) / 2;
		    //}
		// 아래 함수의 공식은 등차수열을 구하는 공식.  
		// 내가 푼 방식은 for문을 이용해 하나씩 다 더하는 방식이었는데,
		// 애초에 문제의 숫자 더하기 방식이 등차수열을 구하는 방식이기 때문에 위의 공식을 사용하면 됨.

	}

}
