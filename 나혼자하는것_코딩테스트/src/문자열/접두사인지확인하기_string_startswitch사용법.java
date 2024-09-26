package 문자열;

public class 접두사인지확인하기_string_startswitch사용법 {

	public static void main(String[] args) {
		// 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
		// 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
		// 문자열 my_string과 is_prefix가 주어질 때, 
		// is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
		// 1 ≤ my_string의 길이 ≤ 100
		// 1 ≤ is_prefix의 길이 ≤ 100
		// my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
		
		String my_string = "banana";
		String is_prefix = "ban";
		
		// 1. "banana"의 접두사인지 확인하기 위해 is_prefix가 
		//    "b", "ba", "ban", "bana", "banan", "banana"에 해당하는지 확인하는 방법
		// 2. 그냥 contains 쓰면 될 듯 - 근데 그럼 접두사가 아닌 경우는 어떻게 해결하지?
		// 3. 그럼 차라리 substring의 end index를 바꾸는 방법으로 is_prefix에 해당하는 순간 1을 반환하게 할까?
		
		int answer = 0;
		
		// for문을 통해 my_string의 substring이 is_prefix에 해당하는 확인하는 방법
		for (int i = 1; i < my_string.length(); i++) {
			if (my_string.substring(0, i).equals(is_prefix )) {
				answer = 1;
				break;
			} 
		}
		
		// startsWith 라는 메서드가 이미존재해서 substring을 쓸 필요가 없었다;
		
		System.out.println(answer);
		
		System.out.println(my_string.startsWith(is_prefix));
		// 그냥 삼항연산자에 startswitch만 사용했어도 되었을 듯

	}

}
