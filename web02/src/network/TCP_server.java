package network;

import java.net.ServerSocket;
import java.net.Socket;

public class TCP_server {

	public static void main(String[] args) throws Exception {
		// 전화기 역할을 하는 객체(Socket)
		// 승인용 Socket(ServerSocket)
		// 데이터 교환용 Socket
		// ==> 서버가 승인하면 Socket이 생성됨
		ServerSocket server = new ServerSocket(9100);
		System.out.println("Port : 9100번 TCP 서버 시작됨");
		System.out.println("클라이언트 요청을 기다림");
		int count = 0;
		while (true) {
			Socket socket = server.accept();
			System.out.println("서버의 승인 OK...");
			count ++;
			System.out.println("현재 연결된 클라이언트 수 >> " + count);
		}
		

	}

}
