package 정수;

public class 구로나눈나머지 {

	public static void main(String[] args) {
		// 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
		// 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 
		// 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
		
		String number = "78720646226947352489";
		
		// 1. long을 통한 계산으로 결과를 만들어야 할 듯
		// 2. long을 써보았는데 오류가 발생했기 때문에 위의 예시처럼 split과 배열을 이용해야 할 듯  
		
		int answer = 0;	
		
		for (int i = 0; i < number.length(); i++) {
			answer += Integer.parseInt(number.substring(i, i+1));
		}
		
		System.out.println(answer % 9);
	}

}
