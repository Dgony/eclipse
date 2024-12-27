package 정수;

public class k의갯수 {

	public static void main(String[] args) {
		// 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
		// 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
		
		int i = 1;
		int j = 13;
		int k = 1;
		
		// 1. k를 보려면 j를 10을 나눈 나머지 수를 확인해야 할 듯
		// 2. 확인한 카운트를 담을 변수 생성 
		// 3. 조건 값이 100,000 이하기 떄문에 여기까지만 상정
		// 4. kk 같은 값이 존재한다면 반복문도 집어넣어야 함
		
		int answer = 0;
		
		for (int l = i; l <= j; l++) {
			for (String x : (l+"").split("")) {
				answer += x.equals(k+"") ? 1 : 0;
			}
		}
		
		System.out.println(answer);

	}

}
