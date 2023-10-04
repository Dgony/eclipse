package 배열기본;

public class 배열맛보기 {

	public static void main(String[] args) {
		// 배열 = 많의 양의 데이터를 다루기 위함.
		// 1. 배열을 만들 때 배열의 값을 이미 알고 있는 경우.
		int[] addr = { 1, 2, 3, 4 }; // 참조형 변수(주소가 저장)
		System.out.println(addr);
		// 2. 배열을 만들 때 값을 모르고 있는 경우.
		int[] addr2 = new int[1000];
		System.out.println(addr2);

	}

}
