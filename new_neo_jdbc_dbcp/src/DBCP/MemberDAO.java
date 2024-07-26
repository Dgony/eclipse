package DBCP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	
	DBConnectionMgr dbcp;
	Connection con;
	
	public MemberDAO() { // 생성자 메서드로 DAO를 불러오는 순간 멤버 변수가 초기화 되도록 설정 - 지연 초기화?
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(MemberVO bag) {
		String sql = "insert into member values(?, ?, ?, ?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			System.out.println("3. sql문 생성 성공!");
			
			ps.execute();
			System.out.println("sql문 전송 성공!");
			
			dbcp.freeConnection(con, ps); // con, ps.close(); 를 대신해 연결을 끊어주는 메서드
			System.out.println("4. 연결 해제");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!!");
		}
	}
	
	public ArrayList<MemberVO> list(MemberVO bag) {
		String sql = "select * from member where id = ?";
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			System.out.println("3. sql문 생성 완료!");
			
			ResultSet rs = ps.executeQuery(); // 쿼리 실행 및 결과 동시 수신
			// ps.execute(); executeQuery가 쿼리 실행을 대신해주기 떄문에 생략
			System.out.println("sql문 전송 완료!");
			
			while (rs.next()) { // rs.next() == 커서를 지정하는 메서드로, 가상의 인덱스 1부터 시작
				// .next()는 커서를 지정해 한 줄 씩 읽어오기 때문에
				// 지정한 값이 존재하는 한 while문으로 rs 전체 반복

				// 받아온 resultset의 각 항목에서 해당하는 값들을 하나씩 추출해주면 됨
				// 검색 결과를 원하는 변수에 넣으면 됨
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString(1));
				vo.setPw(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setTel(rs.getString(4));
				list.add(vo);
				
			}
			
			dbcp.freeConnection(con, ps);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("에러 발생!");
		}
		
		return list;
		
	}
	
	

}
