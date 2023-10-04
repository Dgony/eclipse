package 배열기본;

public class 타입별배열만들기 {

	public static void main(String[] args) {
		// int, char, String, JButton, double, boolean
		int[] age = { 200, 100, 50, 10 }; // 배열 길이 4로 고정
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

		System.out.println();

		for (int x : age) {
			System.out.print(x + " ");
		}

		System.out.println();

		double[] weight = { 99.9, 88.8, 77.7, 66.6 };

		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i]);
		}

		System.out.println();

		for (double d : weight) {
			System.out.println(d + " ");
		}

		// 이름 ==> String[] name
		// 성별 ==> char[] gender
		// 아침여부 ==> boolean[] food
		
		String[] name = { "홍길동", "허준", "허균", "허난설헌" };
		for (String string : name) {
			System.out.println(string);
		}
		
		char[] gender = {'남', '여'};
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] food = {true, false};
		for (boolean b : food) {
			System.out.println(b);
		}
		
	}

}
