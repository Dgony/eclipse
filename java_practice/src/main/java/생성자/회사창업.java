package 생성자;

public class 회사창업 {

	public static void main(String[] args) {
		// 회사에 직원 뽑기
		직원 employee1 = new 직원("홍길동", 19, '남');
		직원 employee2 = new 직원("김길동", 29, '여');
		직원 employee3 = new 직원("이길동", 39, '남');
		직원 employee4 = new 직원("박길동", 49, '여');
		
		System.out.println("직원정보 " + employee1);
		System.out.println("직원정보 " + employee2);
		System.out.println("직원정보 " + employee3);
		System.out.println("직원정보 " + employee4);
		System.out.println("총 직원 수는 " + 직원.count); // static은 인스턴스 생성 없이 사용 가능

	}

}
