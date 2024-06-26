package 생성자;

public class 수강신청게시판 {

	public static void main(String[] args) {

		수강신청템플릿 template1 = new 수강신청템플릿("자바", "10:30", "홍길동");
		수강신청템플릿 template2 = new 수강신청템플릿("파이썬", "11:30", "감길동");
		수강신청템플릿 template3 = new 수강신청템플릿("몽고db", "12:30", "박길동");
		
		System.out.println(template1);
		System.out.println(template2);
		System.out.println(template3);
		
		
	}

}
