package 정수제어;

public class 이어붙인수_c타입for문_parseInt {

	public static void main(String[] args) {
		// 정수가 담긴 리스트 num_list가 주어집니다. 
		// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ num_list의 길이 ≤ 10
		// 1 ≤ num_list의 원소 ≤ 9
		// num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
		
		int[] num_list = {3, 4, 5, 2, 1};
		
		String even = "";
		String odd = "";
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				even += num_list[i];
			} else {
				odd += num_list[i];
			}
		}
        
        System.out.println(Integer.parseInt(even) + Integer.parseInt(odd));

	}

}
