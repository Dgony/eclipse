package 정수제어;

public class 주사위게임2 {

	public static void main(String[] args) {
		// 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
		// 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
		// 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
		// 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
		// 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		// a, b, c는 1이상 6이하의 정수입니다.
		
		int a = 2;
		int b = 6;
		int c = 1;
		
		// 1. 세 숫자를 각각 비교할 수 있는 방법이 필요
		// 2. if 문이나 삼항연산자의 조건을 사용해 결과값을 대입할 수 있을 듯
		
		int answer = 0;
		
		int x = a + b + c;
		int y = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		int z = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
		
		answer = 
				a != b && b != c && a != c ? 
						x : a == b && b == c && a == c ?
								x * y : a == b || b == c || a == c ? x * y * z : 0; 
								
		
		
		System.out.println(answer);
		

	}

}
