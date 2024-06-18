package 스위치와조건문;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class 날짜를가져오는메서드 {

	public static void main(String[] args) {
		// java 8 버전 이후 time 클래스가 생김
		// 날짜 계산같은 시간관련 메서드 활용을 위해 LocalDate 참조형 변수가 생김
		
		LocalDate today = LocalDate.now();
		// 현재 날짜를 가져오는 인스턴스
		
		LocalDate someday = LocalDate.of(2024, 6, 18);
		// 매개변수를 통해 특정 날짜를 지정하는 인스턴스
		
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		// 날짜를 년, 월, 일로 분리해서 변수에 할당하는 메서드
		
		DayOfWeek weekday1 = today.getDayOfWeek();
		int weekday2 = weekday1.getValue();
		// 요일 정보를 가져오는 메서드들
		
		int yearday = today.getDayOfYear();
		// 1년중 몇번째 날인지 계산해주는 메서드
		
		LocalDate nextday = today.plusDays(3);
		LocalDate yesterday = today.minusDays(3);	
		// 매개변수만큼 날짜를 계산해주는 메서드
		// 기존 날짜 관련 클래스는 이런 계산이 불가능 했던 것으로 기억
		
		System.out.println(today);
		System.out.println(someday);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(weekday1);
		System.out.println(weekday2);
		System.out.println(yearday);
		System.out.println(nextday);
		System.out.println(yesterday);
		
		

	}

}
