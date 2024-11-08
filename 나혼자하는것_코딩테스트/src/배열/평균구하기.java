package 배열;

public class 평균구하기 {

	public static void main(String[] args) {
		// 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		// arr은 길이 1 이상, 100 이하인 배열입니다.
		// arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
		
		int[] arr = {1,2,3,4};
		
		// 1. 반복문을 통해 int answer에 누적시키고 arr의 길이만큼 나누기
		
		double answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer /= arr.length;
		
		System.out.println(answer);

	}

}
