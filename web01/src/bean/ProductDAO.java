package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	Connection con = null; // 클래스 바로 아래에 만들어주면 클래스 전체영역에서 사용 가능
	DBConnectionMgr dbcp; // null

	public ProductDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();// 임대
		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
	}
	
	public ArrayList<ProductVO> list() {
		ArrayList<ProductVO> list = new ArrayList<>();
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql); //
			System.out.println("3. sql문 생성 성공!!");

			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			// System.out.println(table.next()); //table안에 데이터가 있으면 true
			while (table.next()) { // table안에 검색결과인 row가 있는지 체크
				ProductVO bag = new ProductVO();
				bag.setId(table.getString("id"));
				bag.setName(table.getString("name"));
				bag.setContent(table.getString("content"));
				bag.setPrice(table.getInt("price"));
				bag.setCompany(table.getString("company"));
				bag.setImg(table.getString("img"));
				list.add(bag);
			}
			dbcp.freeConnection(con, ps, table);//반납 
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return list;
	} // list
	
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
	
	public int delete(String id) {
		int result = 0;
		try {
			String sql = "delete from product where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result; // 이러면 1 이나 0
	}
	
	
	public int update(String id, String content) {
		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update product set content = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, content); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			ps.setString(2, id); // 물음표 번호 2번에 pw에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			dbcp.freeConnection(con, ps);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;
	}
	
	public ProductVO one(String id) {
		ProductVO bag = new ProductVO();
		try {
			String sql = "select * from product where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			// System.out.println(table.next()); //table안에 데이터가 있으면 true
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크
				String id2 = table.getString("id"); // id는 컬럼명
				String name = table.getString("name");
				String content = table.getString("content");
				int price = table.getInt("price");
				String company = table.getString("company");
				String img = table.getString("img");
				bag.setId(id2);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);
			} else {
				System.out.println("검색결과가 없음.");
			}
			dbcp.freeConnection(con, ps, table);//반납 
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return bag;
	}
}
