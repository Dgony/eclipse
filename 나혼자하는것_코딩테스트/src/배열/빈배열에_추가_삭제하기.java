package 배열;

import java.util.Stack;

public class 빈배열에_추가_삭제하기 {

	public static void main(String[] args) {
		// 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
		// 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, 
		// flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
		// flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.

		// 제한사항
		// 1 ≤ arr의 길이 = flag의 길이 ≤ 100
		// arr의 모든 원소는 1 이상 9 이하의 정수입니다.
		// 현재 X의 길이보다 더 많은 원소를 빼는 입력은 주어지지 않습니다.

		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
		
		// 1. 빈 배열을 배열로 설정할지 list 인터페이스로 설정할지  
		//    더 간단한 방법을 찾자. 
		// 2. 지문에 추가 삭제가 계속 반복되는 것을 보니 순서가 있는 list 인터페이스가 필요
		//    ArrayList가 가장 적당할 듯
		// 3. 이중 for문이 필요할 것 같음
		
		Stack<Integer> x = new Stack<Integer>();
		
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == true) {
				for (int j = 0; j < arr[i] * 2; j++) {
					x.push(arr[i]);
				}
			} else{
				for (int j = 0; j < arr[i]; j++) {
					x.pop();
				}
			}
		}
		
		System.out.println(x);


	}

}
