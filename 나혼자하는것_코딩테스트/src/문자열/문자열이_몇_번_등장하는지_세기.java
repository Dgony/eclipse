package 문자열;

public class 문자열이_몇_번_등장하는지_세기 {

	public static void main(String[] args) {
		// 문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
		// 제한사항
		// 1 ≤ myString ≤ 1000
		// 1 ≤ pat ≤ 10
		
		String myString = "banana";
		String pat = "ana";
		
		// 1. 중복 등장도 세기 때문에 위의 경우 2번 등장하는 셈이 됨.  
		// 2. 가장 먼저 생각나는 건 pat의 길이만큼 자른 substring을 contain 여부로 판단
		//    그걸 반복해가며 mtString 끝까지 반복하면 중복하면서 체크도 가능하지 않을까?   
		
		int answer = 0;
		
		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			answer += myString.substring(i, i + pat.length()).equals(pat) ? 1 : 0;
		}
		
		System.out.println(answer);
	}

}
