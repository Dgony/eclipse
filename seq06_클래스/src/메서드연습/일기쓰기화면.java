package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	public void open() {
		FlowLayout flow = new FlowLayout();
		Font font = new Font("굴림", 1, 50);
		JFrame f = new JFrame();
		f.setTitle("일기장쓰기 화면");
		f.setSize(650, 1050);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.green);

		JLabel to1 = new JLabel();
		to1.setText("오늘의 날짜");

		JLabel ti1 = new JLabel();
		ti1.setText("오늘의 제목");

		JLabel doc1 = new JLabel();
		doc1.setText("오늘의 내용");

		JTextField to2 = new JTextField(10);
		to2.setForeground(Color.blue);

		JTextField ti2 = new JTextField(10);
		ti2.setForeground(Color.blue);

		JTextArea doc2 = new JTextArea(5, 10);
		doc2.setForeground(Color.blue);

		JButton b1 = new JButton();
		b1.setBackground(Color.magenta);
		b1.setText("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				String day = to2.getText();
				String title = ti2.getText();
				String content = doc2.getText();
				try {
					FileWriter file = new FileWriter(day + ".txt"); // 텍스트만 저장할 수 있는 메서드
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close(); // stream을 닫는다.
					to2.setText("");
					ti2.setText("");
					doc2.setText("");
					File file2 = new File(day + ".txt");
					boolean result = file2.exists();
					int x = 0;
					if (result == true) {
						x++;
					}
					JOptionPane.showMessageDialog(f, "일기 " + x + "개 저장 완료");
				} catch (Exception e) {
					// 대처할 내용
					System.out.println("에러 발생함.");
					e.printStackTrace();// TODO: handle exception
				}
				
			}
		});

		to1.setFont(font);
		to2.setFont(font);
		ti1.setFont(font);
		ti2.setFont(font);
		doc1.setFont(font);
		doc2.setFont(font);
		b1.setFont(font);

		f.add(to1);
		f.add(to2);
		f.add(ti1);
		f.add(ti2);
		f.add(doc1);
		f.add(doc2);
		f.add(b1);

		f.setVisible(true);
	}
}
