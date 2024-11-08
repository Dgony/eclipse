package 정수;

public class 나머지가1이되는수찾기 {

	public static void main(String[] args) {
		// 자연수 n이 매개변수로 주어집니다. 
		// n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
		// 답이 항상 존재함은 증명될 수 있습니다.
		// 3 ≤ n ≤ 1,000,000
		
		int n = 12;
		
		// 1. 반복문을 사용해 x가 조건을 만족하는 순간 break
		
		int answer = 1;
		
		while(answer < n) {
			if (n % answer == 1) {
				break;
			}
			answer++;
		}

		System.out.println(answer);
	}

}
