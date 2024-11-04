package 배열;

public class 특별한이차원배열2 {

	public static void main(String[] args) {
		// n × n 크기의 이차원 배열 arr이 매개변수로 주어질 때, 
		// arr이 다음을 만족하면 1을 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
		// 0 ≤ i, j < n인 정수 i, j에 대하여 arr[i][j] = arr[j][i]
		// 1 ≤ arr의 길이 = arr의 원소의 길이 ≤ 100
		// 1 ≤ arr의 원소의 원소 ≤ 1,000
		// 모든 arr의 원소의 길이는 같습니다.
		
		int[][] arr = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};
		
		// 1. 즉 이차원 배열 모든 요소를 풀회전하면서 ij, ji를 비교하면됨
		// 2. 만약 모두 일치하면 1반환, 일치하지 않으면 0반환
		// 3. 반복문을 3번만 반복하면 모두 비교 됨
		
		int answer = 1; 
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] != arr[j][i]) {
					answer = 0;
					break;
				}
			}
		}
		
		System.out.println(answer);


	}

}
