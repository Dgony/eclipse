package 스위치와조건문;

public class 조건문에서String의비교 {

	public static void main(String[] args) {
		// String의 비교인 경우 equals()사용
		String menu1 = "김치찌개";
		String menu2 = "된장찌개";
	
		String result = "";
		if (menu1.equals(menu2)) {
			result = "두 음식은 같은 메뉴입니다.";
		} else {
			result = "두 음식은 다른 메뉴입니다.";
		}
		
		System.out.println(result);

	}

}
