package DBCP;

import java.util.Scanner;

public class Member_main_select {
	
	public static void main(String[] args) {
		MemberVO bag = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("member 테이블에서 검색할 id를 입력해주세요.");
		bag.setId(sc.next()); 
		
		
		System.out.println(dao.list(bag)); 
		
		
	}

}
