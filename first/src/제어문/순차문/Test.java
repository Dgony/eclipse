package 제어문.순차문;

import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력해주세용 >> ");
		
		String name = sc.next(); // String으로 입력한 값을 가져온다.
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.print("나이 입력해주세용 >> ");
		int age = sc.nextInt(); // 입력되는 String을 int로 변경해주는 것
		System.out.println("당신의 나이는 " + age + "입니다.");
		System.out.println("당신의 내년 나이는  " + (age + 1) +  "입니다.");
		
		System.out.print("당신의 몸무게를 입력해주세용 >>> ");
		double weight = sc.nextDouble();
		System.out.println("당신의 몸무게는 " + weight + "입니다.");
	}

}
