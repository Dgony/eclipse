package 프로그래머스입문;

import java.util.Scanner;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		Solution6 s = new Solution6();
		int result = s.solution(num1);
		System.out.println(result);
		sc.close();

	}

}

class Solution6 {
	public int solution(int n) {
        // 일단 피자는 최소 한 판
        int pizza = 1;
        
        // 피자가 7조각이니까 인원수/피자 했을 때
        // 피자의 갯수가 0이거나 0보다 커야 함
     	// 만약 남은 피자의 갯수가 위 조건을 만족하지 못하면 피자 추가
        while (!((pizza * 7) / n >= 1)) {	
				pizza++;
		}
        
		return pizza;
    }
}
