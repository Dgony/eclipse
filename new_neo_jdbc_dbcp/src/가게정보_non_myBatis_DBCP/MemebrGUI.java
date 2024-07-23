package 가게정보_non_myBatis_DBCP;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemebrGUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("맑은 고딕", 1, 20);

		JLabel l1 = new JLabel("id : ");
		JLabel l2 = new JLabel("pw : ");
		JLabel l3 = new JLabel("name : ");
		JLabel l4 = new JLabel("tel : ");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JButton b1 = new JButton("Member 삽입");
		JButton b2 = new JButton("Member 삭제(id 기준)");
		JButton b3 = new JButton("Member 수정(id 기준)");

		f.getContentPane().setLayout(flow);
		f.getContentPane().setBackground(Color.green);
		f.setSize(290, 400);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		MemberDTO bag = new MemberDTO();

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bag.setId(t1.getText());
				bag.setPw(t2.getText());
				bag.setName(t3.getText());
				bag.setTel(t4.getText());

				MemberDAO dao = new MemberDAO();
				try {
					dao.insert(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bag.setId(t1.getText());
				MemberDAO dao = new MemberDAO();

				try {
					dao.delete(bag);
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bag.setId(t1.getText());
				bag.setPw(t2.getText());
				bag.setName(t3.getText());
				bag.setTel(t4.getText());
				MemberDAO dao = new MemberDAO();
				
				try {
					dao.update(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
