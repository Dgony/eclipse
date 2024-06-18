package 스위치와조건문;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class 날짜와조건문 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		int month = date.getMonthValue();
		DayOfWeek dayofweek1 = date.getDayOfWeek();
		int dayofweek2 = dayofweek1.getValue();
		int dayofyear = date.getDayOfYear();
		
		
		// 현재 년도가 2000년도 이상이면 밀리니엄 세데
		String result1 ="";
		if (year >= 2000) {
			result1 = "밀레니엄 세대시군요!";
		} else {
			result1 = "밀레니엄 세대가 아니시군요!";
		}
		
		// 토, 일은 쉬~~자 / 나며지 요일을 열심히 일하자
		String result2 = "";
		if (dayofweek2 == 6 || dayofweek2 == 7) {
			result2 = "쉬~~~자";
		} else {
			result2 = "열심히 일하자";
		}

		// 달마다 알맞은 계절 출력
		String result3 = "";
		switch (month) {
		case 3 : case 4 : case 5 :
			result3 = "봄";
			break;
		case 6 : case 7 : case 8 :
			result3 = "여름";
			break;
		case 9 : case 10 : case 11 :
			result3 = "가을";
			break;
		case 12 : case 1 : case 2 :
			result3 = "겨울";
			break;
		default:
			break;
		}
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
