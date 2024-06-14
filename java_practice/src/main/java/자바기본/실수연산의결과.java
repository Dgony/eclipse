package 자바기본;

public class 실수연산의결과 {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		int sum = x + y;
		System.out.println("두 수의 합은 " + sum);
		
		// 정수 간의 연산일 대
		int count = 7;
		int result = sum / count;
		System.out.println("나누기 결과는 " + result);
		// 결과는 42.857... 임에도 불구하고 정수로 표시
		
		// 정수와 실수의 연산일 때
		double result2 = (sum / (double)count);
		System.out.println("나누기 결과는 " + result2);
		
		

	}

}
