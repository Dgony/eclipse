package 배열;

public class 날짜비교하기 {

	public static void main(String[] args) {
		// 정수 배열 date1과 date2가 주어집니다. 
		// 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 
		// 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
		// 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
		// date1의 길이 = date2의 길이 = 3
		// 0 ≤ year ≤ 10,000
		// 1 ≤ month ≤ 12
		// day는 month에 따라 가능한 날짜로 주어집니다.
		
		int[] date1 = {2021, 12, 28};
		int[] date2 = {2021, 12, 29};
		
		// 1. 즉 날짜 비교가 최소 3번 이루어짐
		// 2. 만약 인덱스 0, 1의 날짜가 같은 경우 2까지 가야 함.
		// 3. if문으로 조건을 정하는 것이 좋을 듯?  
		
		int answer = 0;
		
		for (int i = 0; i < 3; i++) {
			if (date1[i] == date2[i]) {
				continue;
			} else {
				answer = date1[i] < date2[i] ? 1 : 0;
				break;
			}
		}
		
		System.out.println(answer);

	}

}
