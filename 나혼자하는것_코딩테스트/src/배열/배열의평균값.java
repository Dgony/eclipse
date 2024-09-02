package 배열;

public class 배열의평균값 {

	public static void main(String[] args) {
		// 정수 배열 numbers가 매개변수로 주어집니다.
		// numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
		
		// 0 ≤ numbers의 원소 ≤ 1,000
		// 1 ≤ numbers의 길이 ≤ 100
		// 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
		
		int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

		
		double answer = 0;
		int sum = 0;
        for (int x : numbers) {
			sum = sum + x;
		}       
        answer = (double)sum / numbers.length;
        
        System.out.println(answer);

	}

}
