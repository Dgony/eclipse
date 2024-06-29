package 스레드;

public class 동시배열스레드 extends Thread {

	public String[] food = { "감자", "고구마", "양파", "옥수수", "비트", "방어", "연어", "돌돔" };

	public void run() {
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
