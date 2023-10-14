package 형변환응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 그래픽에크롤링얹어보기 extends JFrame {
	
	Connection conn = Jsoup.connect("https://cafe.naver.com/steamindiegame");
	
	JButton b1;
	JTextArea t1;
	Font font;
	
	public 그래픽에크롤링얹어보기() {
		setTitle("그래픽에 크롤링 얹어보기");
		setSize(600, 600);
		setLayout(new FlowLayout());  
		font = new Font("굴림", Font.BOLD, 50);
		
		Elements list;
		
		try {
			Document doc = conn.get();
			list = doc.select("span");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1 = new JTextArea(5, 10);
		t1.setBackground(Color.cyan);
		t1.setForeground(Color.red);
		
		b1 = new JButton("버튼");
		
		t1.setFont(font);
		b1.setFont(font);
		
		add(t1);
		add(b1);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static void main(String[] args) {
		그래픽에크롤링얹어보기 name = new 그래픽에크롤링얹어보기 ();

	}

}
