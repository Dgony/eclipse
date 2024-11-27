package 정수;

public class 히샤드수 {

	public static void main(String[] args) {
		// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
		// 예를 들어 18의 자릿수 합은 1+8=9이고, 
		// 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
		// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		// x는 1 이상, 10000 이하인 정수입니다.
		
		int x = 13;
		
		// 1. 자릿수를 구하면 % 10을 통해 나머지를 구하고 누적시키면 됨.  
		// 2. 더이상 10으로 나머지가 구해지지 않는 숫자까지 반복하는 재귀함수 만들면될 듯?
		
		int answer = 0;
		
		
		

	}
	
	public int plus(int y) {
		if (y / 10 < 1) {
			return 1;
		}
		return y;
		
	}

}
