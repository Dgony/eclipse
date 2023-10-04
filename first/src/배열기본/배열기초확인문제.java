package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// int 크기 5인 배열을 생성해보세요
		int[] array = new int[5];

		// 배열의 크기를 프린트해보세요
		System.out.println(array.length);

		// 배열의 첫번째 위치에 100을 넣어서, 프린트
		array[0] = 100;
		System.out.println(array[0]);

		// 배열의 마지막 위치에 500을 넣어서, 프린트
		array[array.length - 1] = 500;
		System.out.println(array[array.length - 1]);

		// 배열의 3번째 위치에 200을 넣어서, 프린트
		array[2] = 200;
		System.out.println(array[2]);
		
		System.out.println("");
		// 배열의 전체 데이터를 프린트
		for (int i : array) {
			System.out.println(i);
		}
		
		System.out.println("");
		// 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int q = 0; q < array.length; q++) {
			System.out.println(q + "번 값은 " + array[q]);
		}
		// 그림을 그려보세요

	}

}
