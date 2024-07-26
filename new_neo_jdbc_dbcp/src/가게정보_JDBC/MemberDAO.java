package 가게정보_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class MemberDAO {
	
	public void insert(MemberDTO bag) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 성공");

		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul"; 
		String user = "root"; 
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");
		
		String insertsql = "insert into member values(?, ?, ?, ?)"; 
		PreparedStatement ps = con.prepareStatement(insertsql);
		ps.setString(1, bag.getId()); 
		ps.setString(2, bag.getPw()); 
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL문 작성 및 SQL 객체화");
		
		ps.execute();  
		System.out.println("4. SQL문 전송 성공");
		
		// 1 ~ 4 단계를 더 간략하게 표현하면서 코드를 단축시킬 수 있는 방법이 없을까?
		// ==> myBatis를 공부하러 가보자!
		
		con.close();
		ps.close();
	}
	
	public void delete(MemberDTO bag) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 성공");

		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul"; 
		String user = "root"; 
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");
		
		String insertsql = "delete from `member` where id = ?"; 
		PreparedStatement ps = con.prepareStatement(insertsql);
		ps.setString(1, bag.getId()); 
		System.out.println("3. SQL문 작성 및 SQL 객체화");
		
		ps.execute();  
		System.out.println("4. SQL문 전송 성공");
		
		con.close();
		ps.close();
	}
	
	public void update(MemberDTO bag) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		System.out.println("1. 드라이버 설정 성공");

		String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul"; 
		String user = "root"; 
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");
		
		String insertsql = "update `member` set pw = ?, name = ?, tel = ? where id = ?"; 
		PreparedStatement ps = con.prepareStatement(insertsql);
		ps.setString(1, bag.getPw()); 
		ps.setString(2, bag.getName());
		ps.setString(3, bag.getTel());
		ps.setString(4, bag.getId()); 
		System.out.println("3. SQL문 작성 및 SQL 객체화");
		
		ps.execute();  
		System.out.println("4. SQL문 전송 성공");
		
		con.close();
		ps.close();
	}
	

}
