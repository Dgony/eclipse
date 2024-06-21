package 배열;

public class 배열의최솟값최댓값구하기 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 처리하기 위해 배열에 집어넣음
		int[] arr1 = {90, 80, 60, 20, 10, 30, 50, 70,};
		
		// 변수를 만들고 전체를 순회하면서 변수에 최소값 비교
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i]; // 현재 인덱스값이 min보다 작으면 min에 집어넣는 메서드
			}
		}
		System.out.println("최솟값은 " + min);
		
		// 변수를 만들고 전체를 순회하면서 변수에 최댓값 비교
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("최대값은 " + max);

	}

}
