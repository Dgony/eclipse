package 생성자;

public class 딸 {

	String name;
	String gender;
	static int wallet = 20000;
	
	public 딸(String name, String gender) {
		wallet -= 1000;
		this.name = name;
		this.gender = gender;
	}
	
	public static void tv보다() {
		System.out.println("아빠 지갑엔 " + wallet + "원 만큼 남았고 슬픔을 달래기 위해 tv를 보았다.");
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
}
