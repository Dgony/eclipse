package 배열;
import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기_정수의관계를이용해배열생성 {

	public static void main(String[] args) {
		// 정수 n과 k가 주어졌을 때, 
		// 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
		// 1 ≤ n ≤ 1,000,000
		// 1 ≤ k ≤ min(1,000, n)
		
		int n = 10;
		int k = 3;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
			if (i % k == 0) {
				list.add(i);
			}
		}
        
        System.out.println(list);
	}

}
