package 정수제어;

public class 공배수 {

	public static void main(String[] args) {
		// 정수 number와 n, m이 주어집니다.
		// 이 때 number가 n의 배수이면서 m의 배수이면 1, 아니면 0을 출력
		int number = 55;
		int n = 10;
		int m = 5;
		
		System.out.println(number % n == 0 && number % m == 0);
	}
	
}
