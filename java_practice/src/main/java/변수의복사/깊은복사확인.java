package 변수의복사;

public class 깊은복사확인 {

	public static void main(String[] args) {
		String[] subject1 = {"국어", "영어", "수학", "컴퓨터", "화학"};
		int[] point1 = {44, 66, 22, 99, 100};
		int[] point2 = point1.clone();
		point2[0] = 22;
		point2[2] = 88;
		
		// 전체 1학기, 2학기 성적 프린트
		for (int i = 0; i < point2.length; i++) {
			System.out.println(
					subject1[i] + "1학기 성적은 " + point1[i] + "점\n" +
					subject1[i] + "2학기 성적은 " + point2[i] + "점" 
					);
		}
		
		// 1학기, 2학기 성적 중 동일한 성적과목수
		int count1 = 0;
		for (int i = 0; i < point2.length; i++) {
			if (point1[i] == point2[i]) {
				count1++;
			}
		}
		System.out.println("1, 2하긱 성적인 동일한 과목은 " + count1 + "개");
		
		// 1학기, 2학기 성적 중 오른 성적과목수
		int count2 = 0;
		String name1 = "";
		for (int i = 0; i < point2.length; i++) {
			if (point1[i] < point2[i]) {
				count2++;
				name1 = subject1[i];
			}
		}
		System.out.println("2학기 성적인 오른 과목은 " + count2 + "개"); 
		
		// 1학기, 2학기 성적 중 오른 과목명
		System.out.println("2학기 성적이 오른 과목 명은 " + name1);

	}

}
