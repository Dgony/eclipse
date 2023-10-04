package 메서드연습;

import java.io.FileWriter;

public class 파일에쓰기테스스 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("test2.txt"); // 텍스트만 저장할 수 있는 메서드
			file.write("hi" + "\n");
			file.write("hi" + "\n");
			file.write("hello" + "\n");
			file.write("goobye" + "\n");
			file.close(); // stream을 닫는다.
		} catch (Exception e) {
			System.out.println("에러 발생함.");
			e.printStackTrace();// TODO: handle exception
		}
		// 파일을 생성하고, 텍스트를 파일까지 보낼 수 있는 통로까지 만든다.
		// 이 통료 == 강물(stream, 스트림)
		// 이런 스트림을 만드는 것이 프로그래밍 할 때는 굉장히 위험한 상황이다. = 오류 발생 가능
		// 위험한 상황에 대해 대처를 꼭 해야함. 위험한 상황의 예는 대표적으로
		// 1. 파일에 읽고 쓸때
		// 2. 네트워크를 연결 할 때
		// 3. cpu를 연결할 때
		

	}

}
