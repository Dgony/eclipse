package 제어문.조건문;

import java.util.Scanner;

class switch_test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력해주세요 >> ");
		String name = sc.next();
		
		if (name.equals("자바")) {
			System.out.println("1101호로 가세요.");
		} else if (name.equals("파이썬")) {
			System.out.println("1102호로 가세요.");
		} else if (name.equals("리눅스")) {
			System.out.println("1103호로 가세요.");
		} else {
			System.out.println("카운터에 문의하세요.");
		}
		
		switch (name) {
		case "자바":
			System.out.println("1101호로 가세요.");
			break; // break를 포함하고 있는 {} 등 괄호로 벗어나겠다
			
		case "파이썬":
			System.out.println("1102호로 가세요.");
			break;
			
		case "리눅스":
			System.out.println("1103호로 가세요.");
			break;

		default:
			System.out.println("카운터에 가서 문의하세요.");
			break;
		}

	}

}
