package 배열;

public class 배열비교같은인덱스 {

	public static void main(String[] args) {
		int[] n1 = {44, 66, 77, 22, 11};
		int[] n2 = {33, 55, 77, 22, 40};
		
		int count1 = 0; // 동일한 갯수를 센다
		int count2 = 0; // 동일하지 않은 갯수를 센다
		
		for (int i = 0; i < n2.length; i++) {
			if (n1[i] == n2[i]) {
				count1 ++;
			} else {
				count2 ++;
			}
		}
		
		System.out.println("n1과 n2의 인덱스와 그 값이 동일한 갯수는 " + count1);
		System.out.println("n1과 n2의 인덱스와 그 값이 동일하지 않은 갯수는 " + count2);

	}

}
