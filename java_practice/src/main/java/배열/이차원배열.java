package 배열;

public class 이차원배열 {

	public static void main(String[] args) {
		// 2차원 배열을 선언하는 방법
		int[][] n1 = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		
		// 2차원 배열의 모든 요소 출력하기 
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.println(n1[i][j]);
			}
		}
		
		System.out.println("2차원 배열의 행의 계수는 " + n1.length);
		System.out.println("2차원 배열의 0행의 열 갯수는 "  + n1[0].length);
		System.out.println("2차원 배열의 1행의 열 갯수는 "  + n1[1].length);
		System.out.println("2차원 배열의 2행의 열 갯수는 "  + n1[2].length);
		

	}

}
