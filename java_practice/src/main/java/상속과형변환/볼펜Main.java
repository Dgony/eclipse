package 상속과형변환;

public class 볼펜Main extends 볼펜 {

	public static void main(String[] args) {
		학용품 write1 = new 학용품();
		볼펜 pen1 = new 볼펜();

		write1.사다();
		pen1.글을쓰다();

	}

}
