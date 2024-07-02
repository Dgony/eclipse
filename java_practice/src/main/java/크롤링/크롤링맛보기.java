package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링맛보기 {
	
	// 이번 크롤링 방법은 mvn repository에서
	// jsoup라는 라이브러리를 가져와서 프로젝트에 추가해야 가능.

	public static void main(String[] args) {
		// 크롤링은 인터넷 문서를 (html) 다 받아온 다음,
		// html문서를 파싱(parser)해서 원하는 정보를추출하는 것
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=252670");
		
		Document doc = null; // jsoup에서 html 문서 등을 다루기 위한 클래스
		Elements list1 = null; 
		Elements list2 = null; 
		Elements list3 = null; 
		// 참조형 변수의 초기화는 null
		// 로컬변수를 try 밖에서 선언해야 하는데, 초기화도 필요
		
		try {
			doc = con.get(); // html을 전부 받아와서 저장
			list1 = doc.select("th"); // doc 에서 특정 선택자를 지정해서 추출
			list2 = doc.select("p.no_today"); // p = 태그, .no_today = 클래스
			list3 = doc.select("td");
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(doc);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		
		
		
		
		

	}

}
