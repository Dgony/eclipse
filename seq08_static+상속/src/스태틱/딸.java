package 스태틱;

public class 딸 {
	public String name;
	public String gender;
	public static int wallet = 10000;
	public static int daughter;

	public 딸(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		daughter ++;
		wallet -= 1000;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}

	public void tv를보다() {
		System.out.println("tv보기 고수");
	}
}
