package 자바기본;

public class 자동형변환_강제형변환 {

	public static void main(String[] args) {
		// 실수와 정수
		float a; // float는 4바이트(32비트) 차지
		short b = 5; // short는 2바이트 차지
		a = b; // 2바이트 데이터타입을 4바이트에 집어넣음, 자동형변환
		System.out.println(a); // 낮은 데이터 타입이 자동형변환 된 걸 볼 수 있음.
		
		float q; // float와 int는 같은 4byte
		q = 6; // 그래서 short를 float에 할당했는데도 자동형변환이 일어남.
		System.out.println(q); // float에 정수를 넣었는데 실수로 저장된 걸 볼 수 있음
		
		// 실수와 정수 2
		double x; // double은 8바이트에 해당하는 공간을 차지
		x = 7;  // 정수 리터럴을 double에 할당했을 때 자동형변환이 일어남
		// int y = x; 8바이트의 x를 4바이트의 y에 넣을 수 없음.
		int y = (int)x; // 더 큰 데이터 타입에 집어넣기 위한 강제 형변환
		
		System.out.println(x);
		System.out.println((int)x);
		System.out.println((double)y);
		
		
		// String과 char
		String i;
		char j;
		i = "양파군단";
		j = '파';
		// i = j; 와 똑같은 2바이트인데 안될까?
		// String은 내부적으로 char[] 문자열에 저장함.
		// 즉 기본 데이터 타입처럼 쓸 수 있지만 참조형 변수인 셈.
		// String과 char를 다루기 위해선 lang의 메서드들을 사용해야 함.
		
		String k = Character.toString(j);
		System.out.println(k);
		// char를 String으로 변환하는 메서드.
		
		char[] g = i.toCharArray();
		System.out.println(g);
		// String을 char[] 배열로 분리하는 메서드
		// String에 내부적으로 가지고 있는 char[] 배열을 이용
		

	}

}
