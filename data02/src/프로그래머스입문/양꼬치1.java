package 프로그래머스입문;

import java.util.Scanner;

public class 양꼬치1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Solution5 s = new Solution5();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();

	}

}

class Solution5 {
    public int solution(int n, int k) {
        int total = 0;
        
        // 전체 지불금액 = 양꼬치 주문금액 + 음료수 주문금액
        int yang = 12000;
        int drink = 2000;
        
        total = (yang * n) + (drink * k);
        
        for (int i = 0; n > 0; n -= 10) {
        	if(n / 10 > 1) {
            	total -= 2000;
            }
		}
        
        
        return total;
    }
}
