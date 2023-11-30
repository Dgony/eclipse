package 문자열관련;

public class 숫자찾기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int num = 29183;
		int k = 1;
		int result = s.solution(num, k);
		System.out.println(result);
	}
}

class Solution1 {
	public int solution(int num, int k) {
		// 인덱스를 활요하는 문제가 나오면 int를 다른 타입으로 바꿈
		// ==> array, list, String 등으로 바꿈
		// ==> 왜 바꿀까? int는 primitive라 메서드가 없음
		String s = String.valueOf(num); // "29183"
		String k2 = String.valueOf(k);
		int index = s.indexOf(k2);
		System.out.println(index + 1);
        int answer = -1;
        if (index > 0) {
			answer = index + 1;
		}
        return answer;
    }
}