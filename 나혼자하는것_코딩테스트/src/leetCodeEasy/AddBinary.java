package leetCodeEasy;

public class AddBinary {

	public static void main(String[] args) {
		
		// 두 이진 문자열 'a'와 'b'가 주어질 때, 
		// 두 이진 문자열을 이진법으로 합친 이진 문자열을 반환하시오.  
		// 1 <= a.length, b.length <= 10 4승
		// a와 b는 0과 1로 이루어져 있음. 
		// 각 문자열은 0그 자체를 제외하고는 0으로 시작하지 않습니다. 
		
		String a = "11";
		String b = "1";
		
		// 단순하게 생각해보면 2가 되면 10 더하기 
		// 자릿수는 어떻게 계산? 배열로 만들거나 2진법을 10진수로 만들어 계산하거나?
		// 가변적인 길이의 배열을 만들어 추가하는 것이 좋을 것 같은 느낌? 더 빠르고 간편한게 있나?
		// 5자리 2자신 정수로 바꿔 계산하기(정수로 바꾸는 반복문 2번사용) 
		// 한쪽은 그대로 두고 다른쪽을 더하며 계산 반복문 5회 추정?

		StringBuilder sb = new StringBuilder();
		
		int x = a.length() - 1;
		int y = b.length() - 1;
		int temp = 0;
		
		while(x >= 0 || y >= 0 || temp > 0) {
			int sum = temp;
			if(x >= 0) sum += a.charAt(x--) - '0';
			if(y >= 0) sum += a.charAt(y--) - '0';
			
			sb.append(sum % 2); 
			temp = sum / 2;
		}
		
		System.out.println(sb.reverse().toString());

	}

}
