package 배열;

public class 칠의_개수 {

	public static void main(String[] args) {
		// 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 
		// 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
		// 제한사항
		// 1 ≤ array의 길이 ≤ 100
		// 0 ≤ array의 원소 ≤ 100,000
		
		int[] array = {7, 77, 17};
		
		// 1. 10진법으로 나누면서 7이 있는지 판단해볼까?  
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			while(array[i] > 0) {
				count += array[i] % 10 == 7 ? 1 : 0;
				array[i] /= 10;
			}
		}
		
		System.out.println(count);
		
		

	}

}
