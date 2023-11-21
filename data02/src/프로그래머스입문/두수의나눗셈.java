package 프로그래머스입문;

import java.util.Scanner;

public class 두수의나눗셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Solution3 s = new Solution3();
		int result = s.solution(num1, num2);
		System.out.println(result);
		
		sc.close();

	}

}

class Solution3 {
	public int solution(int num1, int num2) {
        int answer = 0;
        double result = (double)num1 / num2;
        System.out.println(result);
        result = result * 1000;
        System.out.println((int)result);
        answer = (int)result;
        return answer;
    }
}
