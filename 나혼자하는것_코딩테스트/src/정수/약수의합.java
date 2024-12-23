package 정수;

public class 약수의합 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		// 제한 사항
		// n은 0 이상 3000이하인 정수입니다.
		// 입출력 예
		// n	return
		// 12	28
		// 5	6	
		// 입출력 예 설명
		// 입출력 예 #1
		// 12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
		// 입출력 예 #2
		// 5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
		
		int n = 12;
		
		// 1. 약수를 구하는 법은 간단
		// 2. 반복문을 통해 n번 만큼 반복하며 n % i == 0 에 해당하는 경우만 누적
		
		int answer = 0 ;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}
		
		System.out.println(answer);
		
		// 인상깊은 풀이
		//for(int i =1 ; i<=num/2;i++){
		      //if(num%i==0){
		        //answer+=i;}}


		        //return answer+num;
		    //}

	}

}
