package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 computer = new 컴퓨터(1000, "삼성", 200);
		컴퓨터 computer2 = new 컴퓨터(2000, "애플", 400);
		System.out.println(computer);
		System.out.println(computer2);
	}

}

