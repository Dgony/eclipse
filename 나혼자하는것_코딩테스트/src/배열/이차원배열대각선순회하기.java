package 배열;

public class 이차원배열대각선순회하기 {

	public static void main(String[] args) {
		// 2차원 정수 배열 board와 정수 k가 주어집니다.
		// i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ board의 길이 ≤ 100
		// 1 ≤ board[i]의 길이 ≤ 100
		// 1 ≤ board[i][j] ≤ 10,000
		// 모든 board[i]의 길이는 같습니다.
		// 0 ≤ k < board의 길이 + board[i]의 길이
		
		int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
		int k = 2;
		
		// 1. 결과값이 되어주는 변수 생성
		// 2. 이중 for문 + if문 비교를 만족하는 경우만 누적 
		
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				 	answer += i + j <= k ? board[i][j] : 0;
			}
		}
		
		System.out.println(answer);

	}

}
