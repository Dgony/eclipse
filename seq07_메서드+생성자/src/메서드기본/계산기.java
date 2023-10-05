package 메서드기본;

public class 계산기 {
	public void add() { // 이 때 void가 있으면 계산까지만 하는것. 값을 받거나 그런 것 없음.
		// add 라고 하는 명령어 = 함수 = 메서드 에 대한
		// 처리 내용을 쭉 써주게 된다.
		System.out.println("더하기 기능 처리됨.");
	}

	public int add2() {
		int price = 5000;
		int count = 3;
		int sum = price * count;
		return sum;
	}
	
	// 입력값을 받기 위해 만들어진 변수 = 괄호 안에 있는거
	// 전달 받는 중간 다리 역할을 하는 변수 라는 의미로
	// 매개변수 == parameter, 파라미터
	public int add3(int price, int count) {
		int result = price * count;
		return result;
	}
	public int add4(int don) {
		int end = don + 2000;
		return end;
	}
}
