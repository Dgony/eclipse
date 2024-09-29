package 배열;

public class 홀수vs짝수_홀짝구분과for문과비교 {

	public static void main(String[] args) {
		// 정수 리스트 num_list가 주어집니다.
		// 가장 첫 번째 원소를 1번 원소라고 할 때, 
		// 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요. 
		// 두 값이 같을 경우 그 값을 return합니다.
		// 5 ≤ num_list의 길이 ≤ 50
		// -9 ≤ num_list의 원소 ≤ 9
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		
		// 1. 배열의 모든 원소를 확인하면서 index가 필요하기 때문에 c타입 for문 사용하면 될 듯
		// 2. %를 통한 몫 남기기로 홀수 작수 판단 가능할 듯.
		
		int odd = 0;
		int even = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {
				even += num_list[i];
			} else {
				odd += num_list[i];
			}
		}
	
		System.out.println(even > odd ? even : odd);
	}

}
