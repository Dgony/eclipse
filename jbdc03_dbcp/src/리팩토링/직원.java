package 리팩토링;

public class 직원 {
	public String name; // 아무데서나 접근 가능
	String address; // 같은 패키지에서만 접근 가능
	protected int salary; // 다른 패키지도 가능하지만, 상속으로만 접근 가능
	private int rrn; // 이 클래스 내에서만 접근 가능
	 
	public String toString() {
		return name + " " + address + " " + salary + " " + rrn;
	}
}
