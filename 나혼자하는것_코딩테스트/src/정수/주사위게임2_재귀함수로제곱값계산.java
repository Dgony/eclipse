package 정수;

public class 주사위게임2_재귀함수로제곱값계산 {

	public static void main(String[] args) {
		// 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
		// 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
		// 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
		// 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
		// 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		// a, b, c는 1이상 6이하의 정수입니다.
		
		int a = 2;
		int b = 6;
		int c = 1;
		
		// 1. 세 숫자를 각각 비교할 수 있는 방법이 필요
		// 2. if 문이나 삼항연산자의 조건을 사용해 결과값을 대입할 수 있을 듯
		
		int x = a + b + c;
		int y = a*a + b*b + c*c;
		int z = a*a*a + b*b*b + c*c*c;
		
		int answer = x * y;
		
		if (a == b && b == c) {
			answer = x * y * z;
		} else if (a != b && b != c && a != c) {
			answer = x;
		}
		
		System.out.println(answer);
		
// 인상깊은 풀이
		// 재귀함수를 활용한 제곱값 계산 
//class Solution {
    //public int solution(int a, int b, int c) {
        //int answer = 1;

        //int count = 1;
        //if(a == b || a == c || b == c) {
            //count++;
        //}

        //if(a == b && b == c) {
            //count++;
        //}

        //for(int i = 1; i <= count; i++) {
            //answer *= (pow(a,i)+pow(b,i)+pow(c,i));
        //}

        //return answer;
//    }

    //private int pow(int a, int b) {
        //if(b == 0) return 1;
        //return a * pow(a, b-1);
    //}
//}

	}

}
