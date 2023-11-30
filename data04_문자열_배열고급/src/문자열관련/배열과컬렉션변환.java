package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import 배열기본.Print;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자", "고구마", "우유", "감자", "양파"};
		Print.arr(냉장고음식);
		
		List<String> list = Arrays.asList(냉장고음식);	
		// 1. 감자가 들어있는 마지막 위치는 구해보세요. 전체출력
		System.out.println(list.lastIndexOf("감자"));
		System.out.println(list);
		
		// 2. 양파를 포함하고 있으면 "양파는 안사도 된다",
		//	  포함하고 있지 않으면 "양파사서 냉장고에 넣어야 한다.", 전체 출력
		if (list.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		} else {
			System.out.println("양파 사서 냉장고에 넣어야 한다.");
		}
		System.out.println(list);
		
		// 3. 우유를 "춘식이 우유"로 수정해보자. 전체출력
		int milk = list.indexOf("우유");
		list.set(milk, "춘식이 우유");
		System.out.println(list);
		
		// 4. 양파를 찾아서 위치를 찾은 후, 해당 위치에
		//    "양파즙"이라고 수정하자. 전체출력
		int onion = list.indexOf("양파");
		list.set(onion, "양파즙");
		System.out.println(list);
		
		// 5. 다시 배열로 변환하여 전체 내용을 출력
		String[] result = (String[]) list.toArray();
		Print.arr(result);
		
		
	}

}
