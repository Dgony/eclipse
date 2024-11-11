package 정수;

public class 간단한식계산하기 {

	public static void main(String[] args) {
		// 문자열 binomial이 매개변수로 주어집니다. 
		// binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 
		// 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
		// 0 ≤ a, b ≤ 40,000
		// 0을 제외하고 a, b는 0으로 시작하지 않습니다.
		
		String binominal = "0 - 7777";
		
		// 1. 마침 이항식의 띄어쓰기가 하나씩이니까 split 사용하면 될 듯?
		// 2. 그리고 switch로 정리
		
		int answer = 0;
		String[] str = binominal.split(" ");
		
		switch (str[1]) {
		case "+":
			answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
			break;
		case "-":
			answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
			break;
		case "*":
			answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
			break;
		}
		
		System.out.println(answer);

	}

}
