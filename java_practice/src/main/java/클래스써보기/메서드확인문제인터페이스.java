package 클래스써보기;

public class 메서드확인문제인터페이스 {

	public static void main(String[] args) {
		// 1. 메서드 만들기
		// getEven(int[] num) ⇒ 배열의 값 중 짝수만 골라서 list에 넣어 리턴, ArrayList<Integer)사용  
		// getOdd(int[] num) ⇒ 배열의 값 중 홀수만 골라서 list에 넣어 리턴, ArrayList<Integer>사용 
		// getUnique(int[] num) ⇒ 배열의 값 중 중복된 값을 없앤 목록을 리턴, HashSet<Integer>사용
		
		// 2. 
		int[] num = {1, 3, 4, 5, 7, 8, 2, 2, 4, 5, 6, 9};
		Cal cal = new Cal();
		System.out.println(cal.getEven(num));
		System.out.println(cal.getOdd(num));
		System.out.println(cal.getUnique(num));

	}

}
