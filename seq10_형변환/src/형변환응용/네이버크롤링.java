package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com"); // Connection 부품 리턴 
		System.out.println(conn);
		try {
			Document doc = conn.get();
			Elements list = doc.select("span");
			// Element = tag
			// Elements = tag 리스트 {태그, 태그, 태그, 태그}
			
//			System.out.println(doc);
			System.out.println(list.size());
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결한 사이트에서 코드를 다 가지고 온다. html 문서에 대한 코드를 가져옴 => Document
		
	}

}
