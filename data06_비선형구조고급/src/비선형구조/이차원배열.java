package 비선형구조;

public class 이차원배열 {

	public static void main(String[] args) {
		// 1차원 배열 선연 방식
		int[] num = new int[3];
		// ==> {0, 0, 0}
		
		// 2차원 배열 ==> 1차원 배열의 결합
		int[][] num2 = new int[3][];
		// 2차원 배열이 들어가려면 무조건 1개 이상의 길이를 가져야하기에
		// 1차원 배열의 길이는 무조건 1 이상이어야 함
		// 2차원 배열부턴 아래 방식으로 집어넣기가 가능하므로
		// 2차원은 길이 지정을 하지 않아도 2차원 배열 선언이 가능
		
		
		int[] row1 = {2, 5, 3};
		int[] row2 = {5, 2};
		int[] row3 = {5, 4, 3, 2, 1};
		
		num2[0] = row1;
		num2[1] = row2;
		num2[2] = row3;
		
		for (int i = 0; i < num2.length; i++) {
			// 2차원 배열 각 행의 열 개수를 따로 세주어야 한다.
			for (int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j]);
			}
			System.out.println();
		}
		

	}

}
