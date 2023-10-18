package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.CookieHandler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db연결.memberDAO;

public class 회원정보UI {	
	

	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져다놓기
		// UI에 뭐가 필요한 부품이지??
		// 화면을 생각하고, 화면에 필요한 부품 구성
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.green);
		f.setTitle("나의 회원정보");
		f.setSize(490, 600);
		f.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("   이미지 들어갈 곳   ");
		JLabel l2 = new JLabel("회원 ID : ");
		JLabel l3 = new JLabel("회원 PW : ");
		JLabel l4 = new JLabel("회원 이름 : ");
		JLabel l5 = new JLabel("회원 TEL : ");
		
		JTextField t1 = new JTextField(10); // 글자 수 입력
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		t1.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		
		JButton b1 = new JButton("회원가입 요청");
		JButton b2 = new JButton("회원탈퇴 요청");
		JButton b3 = new JButton("회원수정 요청");
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b1.setOpaque(true);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.blue);
		b2.setOpaque(true);
		b3.setBackground(Color.yellow);
		b3.setForeground(Color.blue);
		b3.setOpaque(true);
		
		Font font = new Font("굴림", Font.BOLD, 30);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리 내용
				// 회원가입 요청을 하면 t들의 내용을 전달해야겠지?
				
				// 1. 입력한 값을 가져온다.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				// 2. db 처리하는 부품을 가져온다
				memberDAO dao = new memberDAO();
				
				// 3. db처리하는 부품에 입력한 값을 주면서 db 해달라고 요청한다.
				dao.insert(id, pw, name, tel);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력해주세요.");				memberDAO dao = new memberDAO();
				dao.delete(id);

			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가져온다.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				// 2. db 처리하는 부품을 가져온다
				memberDAO dao = new memberDAO();
				
				// 3. db처리하는 부품에 입력한 값을 주면서 db 해달라고 요청한다.
				dao.update(id, pw, name, tel);	
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
