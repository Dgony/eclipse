package 반복문과랜덤;

public class 점프하면서더하기 {

	public static void main(String[] args) {
		// 33 ~ 222모두 더하기
		int result1 = 0;
		for (int i = 33; i <= 222; i++) {
			result1 += i;
		}
		System.out.println("result1의 결과는 " + result1);
		
		// 55 ~ 4500, 2씩 점프하면서 더하기
		int result2 = 0;
		for (int i = 0; i <= 4500; i+=2) {
			result2 += i;
		}
		System.out.println("result2의 결과는 " + result2);
		
		// 0 ~ 6000, 5씩 점프하면서 더하기
		int result3 = 0;
		for (int i = 0; i < 6000; i+=5) {
			result3 += i;
		}
		System.out.println("result3의 결과는 " + result3);
		
		// 1 ~ 1000 까지 3씩 점프하면서 더하기, 5의 배수는 더하지 않음
		int result4 = 0;
		for (int i = 0; i < 1000; i+=3) {
			if (i != 5) {
				result4 += i;
			}
		}
		System.out.println("result4의 결과는 " + result4);

	}

}
