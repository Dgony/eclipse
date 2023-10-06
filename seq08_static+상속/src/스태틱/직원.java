package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count;
	public static int age2;
	
	
	public 직원(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		age2 += age;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", sex=" + gender + "]";
	}
	
	// 평균을 구해주는 메서드를 만들어보자.
	public static int getAvg() {
		// static 메서드 안에서 instance를 쓰면 에러가 난다.
		return age2 / count;
	}
}
