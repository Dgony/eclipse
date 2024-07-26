package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_기본 {

	public static void main(String[] args) throws Exception { // 외부자원(DB)과 연결하기 때문에 예외처리가 필요한 부분
		// 1. 커넥터 설정
		Class.forName("com.mysql.cj.jdbc.Driver"); // jar로 가져온 라이브러리에 존재하는 드라이버
		System.out.println("1. 드라이버 설정 성공");
		
		// 2. DB 연결
		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul"; // 사용하는 db 유형과 port번호 등
		String user = "root"; // DB를 이용하는 접근자의 id
		String password = "1234"; // DB를 이용하는 접근자의 pw
				
		Connection con = DriverManager.getConnection(url, user, password);
		// 설정한 드라이버의 매니저가 url로 user와 password로 접근하는 메서드
		// Connection은 JDBC API의 일부로, DB와 상호작용할 수 있는 표준 방법을 제공한다. 
		// DB에 연결하고, SQL 쿼리를 실행하며, 트랜잭션 관리 작업 가능
		System.out.println("2. DB 연결 성공");
		
		// 3. SQL문 객체 생성
		String insertsql = "insert into member values('baby', '1212', 'baby', '2950')"; 
		// 현제 db는 2단계에서 연결했기 때문에 sql만 제대로 작성하면 됨
		
		PreparedStatement ps = con.prepareStatement(insertsql);
		// con이라는 연결에 insertsql이라는 sql문의 실행을 얹은 상태인 ps를 생성
		System.out.println("3. SQL문 작성 및 SQL 객체화");
		
		// 4. SQL문 전송
		ps.execute(); // 준비된 ps를 실행, con의 db 경로를 찾아 insertsql문 실행 
		System.out.println("4. SQL문 전송 성공");
		
		con.close();
		ps.close();	
	}

}
