package 형변환응용;

import java.io.IOException;

import javax.swing.JFrame;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 그래픽에크롤링얹어보기 extends JFrame {
	
	Connection conn = Jsoup.connect("https://cafe.naver.com/steamindiegame");
	
	public 그래픽에크롤링얹어보기() {
		setTitle("그래픽에 크롤링 얹어보기");
		
		Elements list;
		
		try {
			Document doc = conn.get();
			list = doc.select("span");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}


	public static void main(String[] args) {
		그래픽에크롤링얹어보기 name = new 그래픽에크롤링얹어보기 ();

	}

}
