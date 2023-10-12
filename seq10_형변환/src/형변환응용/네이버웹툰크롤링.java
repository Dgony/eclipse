package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {

	public static void main(String[] args) {
		Connection conn =  Jsoup.connect("https://finance.naver.com/sise/");
		System.out.println(conn);
		try {
			Document doc = conn.get();
			Elements list = doc.select("div");

			System.out.println(list.size());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
