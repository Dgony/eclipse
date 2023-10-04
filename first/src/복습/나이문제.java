package 복습;

public class 나이문제 {

	public static void main(String[] args) {
		byte age = 100;
		int age2 = age + 1;
		
		String result = "아직 젊어요!";
		
		if (age2 > 100) {
			result = "이제부터 시작!";
		}
		System.out.println(result);
	}

}
