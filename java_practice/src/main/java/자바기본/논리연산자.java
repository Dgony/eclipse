package 자바기본;

public class 논리연산자 {

	public static void main(String[] args) {
		// $$, ||, !
		
		
		// 회원가입 시 입력한 정보
		int id = 1111;
		int pw = 2222;
		
		// 현재 입력하는 정보
		int id2 = 1111;
		int pw2 = 3333;
		
		if (id == id2 && pw == pw2) {
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 no");
		}
		
		// &&와 ||연산자의 특성상, 
		// &&의 경우 왼쪽 항이 false인 경우 계산 불필요,
		// ||의 경우 왼쪽 항이 true인 경우 계산 불필요

	}

}
