package 배열응용;

public class 배열최소값구하기1 {

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		
		// 최소값/최대값을 찾을 때는
		// 인덱스를 하나씩 옮기면서 
		// 거기까지의 최소값/최대값을 넣어둘 수 있는
		// 변수를 따로 만들어주세요..
		// 그 최소값/최대값보다 작거나 크면
		// 최소값/최대값 넣어주는 변수가 변경됨
		
		int min = s[0];
		int max = s[0];
		
		for (int x : s) {
			if (x < min) {
				min = x;
			} else if (x > max) {
				max = x;
			}
		} // for
		
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
		
	} // main

}
