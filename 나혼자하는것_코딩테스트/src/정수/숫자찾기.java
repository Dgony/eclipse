package 정수;

public class 숫자찾기 {

	public static void main(String[] args) {
		// 정수 num과 k가 매개변수로 주어질 때, 
		// num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		// 0 < num < 1,000,000
		// 0 ≤ k < 10
		// num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.
		
		int num = 232443;
		int k = 4;
		
		// 1. num을 문자열로 만든다
		// 2. 반복문을 통해 배열 순회를 한다
		// 3. k에 해당하는 값을 만나면 그 index를 반환한다.   
		
		System.out.println((num+"").indexOf(k+""));
		
		int answer = (num+"").indexOf(k+"");
		
		System.out.println(answer);

	}

}
