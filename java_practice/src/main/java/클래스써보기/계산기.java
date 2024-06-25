package 클래스써보기;

public class 계산기 {
	
	public int x;
	public int y;
	
	public int plus() { // 매개변수가 없이 메서드로만 이루어지는 경우
		return x + y;
	}
	
	public int minus() {
		return x - y;
	}
	
	public int multiplication() {
		return x * y;
	}
	
	public int divsion() {
		return x / y;
	}
	
	public int add(int i, int j) { // 매개변수를 받는경우
		return i + j;
	}
	
	public double add(double i, double j) { // 매개변수를 받는경우
		return i + j;
	}
	
	public double add(int i, double j) { // 매개변수를 받는경우
		return i + j;
	}
	
	public String add(String i, int j) { // 매개변수를 받는경우
		return i + j;
	}

	@Override // 클래스를 그대로 출력하면 아래 문구가 출력되는 모시꺵이
	public String toString() {
		return "계산기 [x=" + x + ", y=" + y + "]";
	}
	
	


}
