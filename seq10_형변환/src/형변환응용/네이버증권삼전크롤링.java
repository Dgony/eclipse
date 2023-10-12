package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권삼전크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930"); // Connection 부품 리턴 
		System.out.println(conn);
		try {
			Document doc = conn.get();
			Elements list = doc.select("span.code");
			
			// Element = tag
			// Elements = tag 리스트 {태그, 태그, 태그, 태그}
			
//			System.out.println(doc);
			System.out.println(list.size());
			
			String code = list.get(0).text();
			// 얘는 태그 1개밖에 없어서 for문을 쓸 필요가 없었음.
			System.out.println("삼성전자 증권 코드 >>> " + code);
			
			System.out.println("==================");
			Elements list2 = doc.select("td.first span.blind");
			System.out.println(list2.size());
			
			String yes = list2.get(0).text();
			String today = list2.get(1).text();
			System.out.println("전일가 >> " + yes);
			System.out.println("시작가 >> " + today);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결한 사이트에서 코드를 다 가지고 온다. html 문서에 대한 코드를 가져옴 => Document
		
	}

}
