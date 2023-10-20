package 상품정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
	
	Connection con;
	
	public ProductDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db연결 성공!!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());
			
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수,int 
			if(rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
	}
	
	public void delete(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수,int 
			if(rowCount == 1) {
				System.out.println("상품 삭제 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		
	} // delete 
	
	public void update(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update product set name = ?, content = ?, price = ?, company = ?, img = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(6, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getContent());
			ps.setInt(3, bag.getPrice());
			ps.setString(4, bag.getCompany());
			ps.setString(5, bag.getImg());
			
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수,int 
			if(rowCount == 1) {
				System.out.println("상품 변경 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
	} // update
	
}
