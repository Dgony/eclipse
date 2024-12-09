package 배열;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
		// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
		// 1 ≤ numbers의 길이 ≤ 9
		// 0 ≤ numbers의 모든 원소 ≤ 9
		// numbers의 모든 원소는 서로 다릅니다.
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		
		// 1. 그럼 0 ~ 9를 모두 더한 수에서 numbers의 총 합을 뺴면 되잖아?  
		
		int answer = 45;
		
		for (int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
		}
		
		System.out.println(answer);
		
		
	}

}
