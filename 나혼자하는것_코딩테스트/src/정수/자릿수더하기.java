package 정수;

public class 자릿수더하기 {

	public static void main(String[] args) {
		// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		// 제한사항
		// N의 범위 : 100,000,000 이하의 자연수
		// 입출력 예
		// N	answer
		// 123	6
		// 987	24
		// 입출력 예 설명
		// 입출력 예 #1
		// 문제의 예시와 같습니다.
		// 입출력 예 #2
		// 9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
		
		int n = 123;
		
		// 1. 각 자릿수를 더하기 위해 문자로 바꾼 후 반복문을 통해 각 요소를 더하면 될 듯?
		// 2. 아니면 10나누기의 나머지를 통해 계속 더해볼까?  
		
		int answer = 0;
		
		while(n > 0) {
			answer += n % 10;
			n /= 10;
		}
		
		System.out.println(answer);
		

	}

}
