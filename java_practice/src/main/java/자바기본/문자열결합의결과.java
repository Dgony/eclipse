package 자바기본;

public class 문자열결합의결과 {

	public static void main(String[] args) {
		int age = 100; 
		double height = 173.5;
		String name = "김길동";
		
		// 결합 연산에 문자열이 포함되어 있으면, 결과는 무조건 문자열
		String result1 = name + "의 나이는 " + age; 
		String result2 = name + "의 키는 " + height;
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
