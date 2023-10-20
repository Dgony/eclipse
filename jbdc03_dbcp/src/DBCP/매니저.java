package DBCP;

public class 매니저 extends 직원 {
	// 이럼 직원의 멤버변수 4개, 메서드 1개를 상속받은 상태.
	private int bonus;
	
	public void test() {
		System.out.println("관리할 사람 이름 : " + name);
		System.out.println("관리할 사람 월급 : " + salary);
		System.out.println("관리할 사람 주소 : " + address);
		// System.out.println("관리할 사람 주민번호 : " + rrn);
		// rrn이 직원class의 private이라 안되지롱~
		System.out.println("관리감독하다.");
	}

}
