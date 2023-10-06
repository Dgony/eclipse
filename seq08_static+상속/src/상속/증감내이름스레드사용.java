package 상속;

public class 증감내이름스레드사용 {

	public static void main(String[] args) {
		증가스레드 plus = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		내이름찍기스레드 name = new 내이름찍기스레드();
		별스레드 t1 = new 별스레드();
		
		plus.start();
		minus.start();
		name.start();
		t1.start();

	}

}
