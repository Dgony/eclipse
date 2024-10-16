package 배열;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		// 정수 배열 numbers와 정수 n이 매개변수로 주어집니다. 
		// numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 
		// 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ numbers의 길이 ≤ 100
		// 1 ≤ numbers의 원소 ≤ 100
		// 0 ≤ n < numbers의 모든 원소의 합
		
		int[] numbers = {34, 5, 71, 29, 100, 34};
		int n = 123;
		
		// 1. foreach문 사용가능할 것 같음
		// 2. 배열의 길이는 100이하, 원소의 크기도 100이하기에 1억 정도의 크기면 int 사용 가능
		// 3. 새로운 숫자 변수에 할당하다 일정 크기를 넘어서면 반환 
		
		int answer = 0;
		for (int i : numbers) {
			answer += i;
            if(answer > n){
                System.out.println(answer);
                // 만약 한번도 n보다 크지 않은 경우도 생각해야 함  
                // 고로 if뿐만 아니라 for에도 return을 작성해주어야 함
            }
		}


	}

}
