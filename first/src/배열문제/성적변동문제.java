package 배열문제;

public class 성적변동문제 {

	public static void main(String[] args) {
		int[]
		term1 = {77,88,99,55,70},
		term2 = {99,100,88,80,70};
		
		int up = 0, same = 0;
		// 1. 성적이 2학기에 항샹된 학생의 수를 카운트
		// 2. 성적이 1, 2학기 동일한 학생의 수를 카운트
		for (int i = 0; i < term2.length; i++) {
			if(term1[i] < term2[i]) {
				up++;
			} else if (term1[i] == term2[i]) {
				same++;
			}
		}
		
		System.out.println(
				"2학기에 성적이 향상된 학생의 수는 " + up + "명이다.\n" + 
				"2학기 성적이 1학기와 동일한 학생의 수는 " + same + "명이다."
				);
	}

}

