package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberDAO {
	// 이제 memberDAO.insert를 쓰면 자동으로 shop db member table에
	// sql문으로 CRUD하는 클래스를 쓸 수 있게 된거임.

	public void delete(String id) { // statice maing파라미터 삭제하고 insert라는 메서드로 만듬.
		// JAVA - DB 연결 (JDBC)
		// 1. 사용할 드라이버 설정 (커넥터, driver)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!");

			// 2. 1번 설정을 커넥터로 db연결하고 승인\
			// 1)) url - ip + port + db명
			// 2)) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			// byte코드를 획득하는 과정
			System.out.println("2. shop db연결 성공!");

			// 3. 2번에서 연결된 것을 가지고 SQL문 생성(현재 shop db에 연결된 상태)
			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 물음표 1번에 id 값을 넣어줘!
			System.out.println("3. SQL문 생성 성공!");
			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 가지고 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 전송 성공!");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생함!!!!");
		}
	} // delete
	
	public void insert(String id, String pw, String name, String tel) { // statice maing파라미터 삭제하고 insert라는 메서드로 만듬.
		// JAVA - DB 연결 (JDBC)
		// 1. 사용할 드라이버 설정 (커넥터, driver)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!");

			// 2. 1번 설정을 커넥터로 db연결하고 승인\
			// 1)) url - ip + port + db명
			// 2)) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			// byte코드를 획득하는 과정
			System.out.println("2. shop db연결 성공!");

			// 3. 2번에서 연결된 것을 가지고 SQL문 생성(현재 shop db에 연결된 상태)
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id); // 물음표 1번에 id 값을 넣어줘!
			ps.setString(2, pw); // 물음표 2번에 pw 값을 넣어줘!
			ps.setString(3, name);
			ps.setString(4, tel);
			System.out.println("3. SQL문 생성 성공!");
			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 가지고 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 전송 성공!");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생함!!!!");
		}
	} // insert
	
	public void update(String id, String pw, String name, String tel) { // statice maing파라미터 삭제하고 insert라는 메서드로 만듬.
		// JAVA - DB 연결 (JDBC)
		// 1. 사용할 드라이버 설정 (커넥터, driver)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!");

			// 2. 1번 설정을 커넥터로 db연결하고 승인\
			// 1)) url - ip + port + db명
			// 2)) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			// byte코드를 획득하는 과정
			System.out.println("2. shop db연결 성공!");

			// 3. 2번에서 연결된 것을 가지고 SQL문 생성(현재 shop db에 연결된 상태)
			String sql = "update member set tel = ? where id = ? and pw = ? and name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);			
			ps.setString(3, pw);			
			ps.setString(4, name);			
			System.out.println("3. SQL문 생성 성공!");
			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 가지고 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 전송 성공!");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생함!!!!");
		}
	} // update

}
