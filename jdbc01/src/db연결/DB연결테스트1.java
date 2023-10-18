package db연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB연결테스트1 {

	public static void main(String[] args) {
		// JAVA - DB 연결 (JDBC)
		// 1. 사용할 드라이버 설정 (커넥터, driver)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!");
		
		// 2. 1번 설정을 커넥터로 db연결하고 승인\
		//		1)) url - ip + port + db명
		//		2)) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url, user, password);
			// byte코드를 획득하는 과정
			System.out.println("2. shop db연결 성공!");
			
		// 3. 2번에서 연결된 것을 가지고 SQL문 생성(현재 shop db에 연결된 상태)
			String sql = "insert into member values ('star3','1234','star','011')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 생성 성공!");
			// URL site = new URL(site);
			
		// 4. 3번에서 생성된 sql문을  가지고 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 전송 성공!");
			
		} catch (ClassNotFoundException | SQLException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생함!!!!");
		}
	}

}
