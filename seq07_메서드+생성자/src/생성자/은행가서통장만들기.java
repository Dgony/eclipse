package 생성자;

public class 은행가서통장만들기 {

	public static void main(String[] args) {
		통장 account = new 통장("홍길동", "990115", 10000);
		
		System.out.println(account.name);
		System.out.println(account.ssn);
		System.out.println(account.money);
		System.out.println(account.toString());

	}

}

