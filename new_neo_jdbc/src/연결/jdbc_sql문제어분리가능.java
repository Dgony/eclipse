package 연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_sql문제어분리가능 {

	public static void main(String[] args) throws Exception { 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 성공");

		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul"; 
		String user = "root"; 
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");
		
		
		String insertsql = "insert into member values(?, ?, ?, ?)"; 
		PreparedStatement ps = con.prepareStatement(insertsql);
		String id = "aabb";
		String pw = "123123";
		String name = "alphabet";
		String tel = "321321";
		ps.setString(1, id); // 대부분의 프로그래밍 언어는 항상 0부터 세지만,
		ps.setString(2, pw); // db는 인덱스가 1부터 시작하므로 유의
		ps.setString(3, name);
		ps.setString(4, tel);
		// ==> insert into member values (id, pw, name, tel)
		// 위 방법을 통해 sql문 제어 가능
		System.out.println("3. SQL문 작성 및 SQL 객체화");
		
		ps.execute();  
		System.out.println("4. SQL문 전송 성공");
		
			
	}

}
