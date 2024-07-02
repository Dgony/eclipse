package 크롤링;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) throws IOException {
		// 네이버 증권 회사별로 증시 정보 크롤링 해보기
		String finance = "https://finance.naver.com/item/main.naver?code=";
		String[] company = {"삼성전자", "NAVER", "한국가스공사", "현대차", "금양", "포스코인터내셔널"};
		String[] codelist = {"005930", "035420", "036460", "005380", "001570", "047050"};
		// String finance를 가져오면 나오는 code 들
		
		Connection con = null; 
		Document doc = null;
		Elements elist = null;
		
		String today = "";
		String yesterday = "";
		String high = "";
		for (int i = 0; i < codelist.length; i++) {
			con = Jsoup.connect(finance + codelist[i]);
			doc = con.get();
			elist = doc.select("span.blind");
			
			today = elist.get(12).text();
			yesterday = elist.get(15).text();
			high = elist.get(16).text();
			
			System.out.println("회사 이름 : " + company[i]);
			System.out.println("오늘가 : " + today);
			System.out.println("전일 : " + yesterday);
			System.out.println("시가 : " + high);
			System.out.println("-----------------");
			
		}
		

	}

}
