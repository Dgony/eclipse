package 예외처리;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨.");
		try {
			System.out.println("2. 0으로 나누기 >> " + 10/0); // 수학적 에러
			int[] arr = {1,2,3}; 
			System.out.println(arr[3]); // 배열 에러 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// 여기에 오류 발생 시 실행할 코드를 적어넣기
			e.printStackTrace(); // 오류 발생을 프린트 해주는 프로그램
			// 서버관리자에게 이메일을 보내는 처리나
			// 메시지를 보내는 처리 등
			System.out.println("0으로 나누는 것은 실패");
		}
		System.out.println("3. 여기는 프린트 될까요??");

	}

}
