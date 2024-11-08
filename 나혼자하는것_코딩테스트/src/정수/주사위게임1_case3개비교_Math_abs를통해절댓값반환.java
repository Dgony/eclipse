package 정수;

public class 주사위게임1_case3개비교_Math_abs를통해절댓값반환 {

	public static void main(String[] args) {
		// 1부터 6까지 숫자가 적힌 주사위가 두 개 있습니다. 두 주사위를 굴렸을 때 나온 숫자를 각각 a, b라고 했을 때 얻는 점수는 다음과 같습니다.
		// a와 b가 모두 홀수라면 a2 + b2 점을 얻습니다.
		// a와 b 중 하나만 홀수라면 2 × (a + b) 점을 얻습니다.
		// a와 b 모두 홀수가 아니라면 |a - b| 점을 얻습니다.
		// 두 정수 a와 b가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		// a와 b는 1 이상 6 이하의 정수입니다.
		
		int a = 3;
		int b = 5;
		
		// 1. 내 짧은 머리로는 결국 2번까지는 비교해야된다는 결론이 나옴
		// 2. 그렇다면 순서대로 &연산, |연산을 한번씩 사용하면 세 경우 모두 도출 가능
		// 3. if나 삼항연산자로 진행하면 될 듯
		int answer = 0;
		if (a % 2 == 1 && b % 2 == 1) {
			answer = a*a + b*b;
		} else if (a % 2 == 1 || b % 2 == 1) {
			answer = 2 * (a + b);
		} else {
			answer = a - b;
		}
		
		System.out.println(Math.abs(answer));
		 

	}

}
