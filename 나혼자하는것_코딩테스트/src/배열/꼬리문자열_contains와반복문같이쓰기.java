package 배열;

public class 꼬리문자열_contains와반복문같이쓰기 {

	public static void main(String[] args) {
		// 문자열들이 담긴 리스트가 주어졌을 때, 모든 문자열들을 순서대로 합친 문자열을 꼬리 문자열이라고 합니다. 
		// 꼬리 문자열을 만들 때 특정 문자열을 포함한 문자열은 제외시키려고 합니다. 
		// 예를 들어 문자열 리스트 ["abc", "def", "ghi"]가 있고 문자열 "ef"를 포함한 문자열은 제외하고 꼬리 문자열을 만들면 "abcghi"가 됩니다.
		// 문자열 리스트 str_list와 제외하려는 문자열 ex가 주어질 때,
		// str_list에서 ex를 포함한 문자열을 제외하고 만든 꼬리 문자열을 return하도록 solution 함수를 완성해주세요.
		// 2 ≤ str_list의 길이 ≤ 10
		// 1 ≤ str_list의 원소의 길이 ≤ 10
		// 1 ≤ ex의 길이 ≤ 5
		
		String[] str_list = {"abc", "def", "ghi"};
		String ex = "ef";
		
		// 1. 문제의 목적은 배열 순회와 contains메서드를 같이 사용할 수 있도록 하려는 것 같음.
		// 2. 꼬리 문자열의 결과에 해당하는 answer 변수를 만들고 시작
		// 3. 배열의 모든 요소를 순회해야 하기 때문에 향상된 for문을 사용할 수 있을 것 같고,
		//    모든 요소마다 contains를 사용하면 될 듯.

		String answer = "";
		for (String string : str_list) {
			answer += string.contains(ex) ? "" : string;
		}
		
		System.out.println(answer);
	}

}
