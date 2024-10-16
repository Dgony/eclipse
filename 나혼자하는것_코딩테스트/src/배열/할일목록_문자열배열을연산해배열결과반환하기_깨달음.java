package 배열;

import java.util.ArrayList;

public class 할일목록_문자열배열을연산해배열결과반환하기_깨달음 {

	public static void main(String[] args) {
		// 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 
		// 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, 
		// todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ todo_list의 길이 1 ≤ 100
		// 2 ≤ todo_list의 원소의 길이 ≤ 20
		// todo_list의 원소는 영소문자로만 이루어져 있습니다.
		// todo_list의 원소는 모두 서로 다릅니다.
		// finished[i]는 true 또는 false이고 true는 todo_list[i]를 마쳤음을, false는 아직 마치지 못했음을 나타냅니다.
		// 아직 마치지 못한 일이 적어도 하나 있습니다.
		
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		// 1. 두 배열의 길이는 같기에 c타입 for문을 이용해 todo_list를 계산
		// 2. 배열은 길이가 바뀔 수 없기에 list 사용
		
		ArrayList<String> answer = new ArrayList();
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) {
				answer.add(todo_list[i]);
			}
		}
		
		System.out.println(answer);
		System.out.println(answer.toArray(new String[0]));
		
		
		// 인상깊은 풀이
		// public String[] solution(String[] todo_list, boolean[] finished) {
	        // String str = "";
	        // for(int i=0; i<finished.length; i++){
	            //str = finished[i]==false ? str+todo_list[i]+"," : str;
	        // } 

	        // return str.split(",");
	    // }
		// 문자열에 ","와 함께 원소를 추가하며 split으로 배열로 반환하는 방식을 사용 
		// 나의 수행이 한참 짧음을 느낌  
		// 어떤 상황에 사용할 수 있을까? ==> 반환값이 String 배열이여야 하며 문자열 배열을 연산해야 하는 과정에서 사용 가능  

	}

}
