package 배열;

public class 가까운1찾기 {

	public static void main(String[] args) {
		// 정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 
		// 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
		// 단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
		// 3 ≤ arr의 길이 ≤ 100'000
		// arr의 원소는 전부 1 또는 0입니다.
		
		int[] arr = {1, 0, 0, 1, 0, 0};
		int idx = 4;
		
		// 1. 결과를 담는 int answer를 만들어둔다.
		// 2. 즉 idx 이후에 등장하는 1의 인덱스를 반환해야 함.없다면 -1 반환 == return + 삼항연산자
		// 3. for문에서 idx로 시작하면 되겠지?
		// 4. for문으로 비교한다면 idx가 1을 만난 경우와 idx가 arr.length와 같은데도 1을 만나지 못한 경우
		
		for (; idx < arr.length; idx++) {
			if (arr[idx] == 1) {
				break;
			}
		}
		idx = idx == arr.length ? -1 : idx;
		
		System.out.println(idx);

	}

}
