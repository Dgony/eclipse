package leetCodeEasy;

public class findTheIndexOfTheFirstOccurenceInAString_substring {

	public static void main(String[] args) {
		
		// 두 문자열 'needle'과 'haystack'이 주어질 때,
		// 'needle'이 'haystack'에서 첫번재로 나타나는 index를 반환하거나,
		// 'haystack'에 'needle'을 포함하지 않는다면 -1 반환
		
		String haystack = "sadbustad";
		String needle =  "sad";
		
		// 순회하다 needle의 첫 index와 일치하는 문자열을 만나면 substring으로 전부 뽑아 확인  
		
		System.out.println(haystack.contains(needle));
		
		int answer = 0;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.substring(i, i+needle.length()).equals(needle)) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
		
	}

}
