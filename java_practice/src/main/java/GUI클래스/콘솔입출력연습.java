package GUI클래스;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 콘솔입출력연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.in 이라는 입력 장치(키보드)로 입력받는 값을 변수에 할당하는 코드
		// 입력장치를 설정하고 sc라는 Scanner 클래스의 인스턴스(객체)를 생성했다. 
		
		// 입력
		System.out.print("현재 내 나이는 >> ");
		
		// 처리
		int age = sc.nextInt();
		int nextage= age + 1;
		
		// 출력
		System.out.println("내년 내 나이는 >> " + nextage);
		
	}

}
