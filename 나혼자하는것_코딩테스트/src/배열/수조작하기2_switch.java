package 배열;

import java.util.Arrays;

public class 수조작하기2_switch {

	public static void main(String[] args) {
		// 정수 배열 numLog가 주어집니다. 
		// 처음에 numLog[0]에서 부터 시작해 "w", "a", "s", "d"로 이루어진 문자열을 입력으로 받아 순서대로 다음과 같은 조작을 했다고 합시다.
		// "w" : 수에 1을 더한다.
		// "s" : 수에 1을 뺀다.
		// "d" : 수에 10을 더한다.
		// "a" : 수에 10을 뺀다.
		// 그리고 매번 조작을 할 때마다 결괏값을 기록한 정수 배열이 numLog입니다. 
		// 즉, numLog[i]는 numLog[0]로부터 총 i번의 조작을 가한 결과가 저장되어 있습니다.
		// 주어진 정수 배열 numLog에 대해 조작을 위해 입력받은 문자열을 return 하는 solution 함수를 완성해 주세요.
		// 2 ≤ numLog의 길이 ≤ 100,000
		// -100,000 ≤ numLog[0] ≤ 100,000
		// 1 ≤ i ≤ numLog의 길이인 모든 i에 대해 |numLog[i] - numLog[i - 1]|의 값은 1 또는 10입니다.
		
		int[] num_log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		// 1. 기준이 되는 수가 idx 0
		// 2. 반복문을 통해 기준을 계속 바꿔가면서 다음 결과가 어떻게 나오는지 switch 문으로 판단
		// 3. 필요한 변수 = 반복문에서 기준이 되는 수, for문의 idx 
		//	  이 때 기준이 되는 수는 반복마다 idx를 활용해 임시로 가져오면 될 듯
		
		String[] answer = new String[num_log.length - 1];
		
		for (int i = 0; i < answer.length; i++) {
			int value = num_log[i];
			int result = num_log[i + 1];
			
			if (value + 1 == result) {
				answer[i] = "w";
			} else if (value - 1 == result) {
				answer[i] = "s";
			} else if (value + 10 == result) {
				answer[i] = "d";
			} else if (value - 10 == result) {
				answer[i] = "a";
			}
		}
		Arrays.toString(answer);
		
		System.out.println(Arrays.toString(answer));
		
		// 조금만 더 생각하면 알 수 있었던 풀이법 
		//class Solution {
		    //public String solution(int[] numLog) {
		        //String answer = "";
		        //for(int i=1; i<numLog.length; i++){
		            //int j = numLog[i-1] - numLog[i];
		            //switch(j){
		                //case -1 : answer+='w'; break;
		                //case 1 : answer+='s'; break;
		                //case -10 : answer+='d'; break;
		                //case 10 : answer+='a'; break;
		            //}
		        //}
		        //return answer;
		    //}
		//}
		
		
		
		
	}

}
