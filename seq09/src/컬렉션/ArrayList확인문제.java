package 컬렉션;

import java.util.ArrayList;

public class ArrayList확인문제 {

	public static void main(String[] args) {
		// 순서 ==> list유형 ==> ArrayList
		// import java.lang.*; ==> String, System, Integer
		// import java.util.*; ==> Array, HashSet, Random, Date
		// 기본적으로 상위 클래스가 lang인 거임, 이런 부품들이 들어있다.
		ArrayList arr = new ArrayList();
		arr.add("박소정");
		arr.add("김정민");
		arr.add("소지현");
		arr.add("김개념");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i + 1) + "등은 " + arr.get(i));
		}
		
		arr.remove(1);
		System.out.println();
		System.out.println("2등이 반칙, 탈락");
		System.out.println();
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i + 1) + "등은 " + arr.get(i));
		}

		// 김정민이 포함되어있나요??
		// 박소정이 몇등인가요?
		// 소지현씨가 개명을 함. => 소혜련!
		System.out.println("김정민이 포함되어있나요? >> " + arr.contains("김정민"));
		System.out.println("박소정이 몇등인가요? >> " + (arr.indexOf("박소정") + 1 + "등"));
		System.out.println(arr.set(1, "소혜련"));
		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i + 1) + "등은 " + arr.get(i));
		}
	}

}
