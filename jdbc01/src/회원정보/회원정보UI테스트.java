package 회원정보;

import javax.swing.JOptionPane;

import db연결.memberDAO;

public class 회원정보UI테스트 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		// shop db에 member 테이블 Insert 하고 싶음
		memberDAO dao = new memberDAO();
		dao.insert(id, pw, name, tel);
		
	}

}
