package 예외처리;

public class 예외처리맛보기 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3}; 
		
		try {
			num[3] = 4; // num에는 index 4가 없기 때문에 오류가 생기는 부분
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("어러 발생 @@@@@@@@@@");
			e.printStackTrace(); // 오류가 생기는 부분을 출력하는 메서드 
		}
		
		// 오류가 있어도 예외처리로 처리했기 떄문에 main 메서드는 끝까지 실행됨
		System.out.println("배열 끝~");

	}

}
