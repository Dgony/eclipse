package 생성자;

public class 직원 {

	String name;
	int age;
	char sex;
	static int count;
	
	public 직원(String name, int age, char sex) {
		count++;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}
