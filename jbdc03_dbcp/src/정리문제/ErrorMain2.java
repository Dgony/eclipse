package 정리문제;

public class ErrorMain2 {

	public static void main(String[] args) {
		Error2 e = new Error2();
		try {
			e.arr2();
		} catch (ArrayIndexOutOfBoundsException e1) {
			// TODO Auto-generated catch block
			System.out.println("main()에서 배열 인덱스 에러를 예외처리함");
		}
		System.out.println("여기는 실행되어야만 해");
		
		// 여기는 throw를 사용하기
		// 1-2 Error2 클래스의 arr2() 메서드는 실행에러를 발생시킬 수 있다.
		// arr2()를 호출했을 때 호출한 메서드에서 에러를 처리하는 코드로 변경하기
		// "main() 에서 배열 인덱스 에러를 예외처리함" 이라고 처리하고
		// "여기는 실행되어야만 해"라고 출력이 가능하도록 수정.
	}

}
