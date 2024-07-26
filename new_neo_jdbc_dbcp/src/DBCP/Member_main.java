package DBCP;

import java.util.Scanner;

public class Member_main {
	
	public static void main(String[] args) {
		MemberVO bag = new MemberVO();
		MemberDAO dao = new MemberDAO();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("member 테이블에 삽입할 id를 입력해주세요.");
		bag.setId(sc.next()); 
		System.out.println("member 테이블에 삽입할 pw를 입력해주세요.");
		bag.setPw(sc.next());
		System.out.println("member 테이블에 삽입할 name를 입력해주세요.");
		bag.setName(sc.next());
		System.out.println("member 테이블에 삽입할 tel를 입력해주세요.");
		bag.setTel(sc.next());
		
		
		
		dao.insert(bag);
	}

}
