package 변수의복사;

import java.util.Arrays;

public class 참조형복사 {
	
	public static void main(String[] args) {
		// 참조형복사
		
		// 얕은 복사(변수의 주소를 복사)
		int[] x = {0, 1, 2, 3, 4, 5};
		int[] y = x;
		
		System.out.println("x의 주소는 " + x);
		System.out.println(Arrays.toString(x));
		System.out.println("y의 주소는 " + y);
		System.out.println(Arrays.toString(y));
		
		
		// 깊은 복사(변수의 주소가 가리키는 값을 복사, 새 변수의 주소는 다름)
		int[] z = x.clone();
		System.out.println("z의 주소는 " + z);
		System.out.println(Arrays.toString(z));
		
		
		
		x[0] = 100; // 그럼 원본 주소의 값을 바꾸면?
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		// 다른 변수지만 주소가 같기 때문에 값이 변하게 됨
		
		System.out.println(Arrays.toString(z));
		// 원본 변수와 같은 값을 가지지만 값을 가리키는 주소가 다르기 때문에 값이 변하지 않음
		
		
		
		
	}

}
