package 반복문과랜덤;

public class 콘솔에별찍기 {

	public static void main(String[] args) {
		String star = "";

		// 콘솔에 별 10줄 찍기
		String arr = "";
		for (int i = 0; i < 11; i++) {
			for (int q = 0; q < 10; q++) {
				arr += "*";
			}
			System.out.println(arr);
			arr = "";
		}
		
		// 콘솔에 피라미드 찍기
		int i = 0;
		for (; i < 6; i++) {
			star += "*";
			System.out.println(star);
		}
		for (; i > 0; i--) {
			System.out.println(star.substring(0, i-1));
		}
		// 오른쪽으로 누운 형태의 피라미드는 for문 두개로 가능
		// 더 다양한 형태의 모양을 만들려면 이중 for문 등을 이용해야 함.

	}

}
