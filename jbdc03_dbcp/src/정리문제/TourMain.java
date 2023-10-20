package 정리문제;

public class TourMain {

	public static void main(String[] args) {
		Tour tour = new Tour();

		//1. 가고 싶은 여행목록을 가지고 와서 다음과 같이 출력
		//    내가 가고 싶은 여행지는 제주도와 부산, 울릉도이다. 빨리가자!
		String[] trip = tour.가고싶은여행지목록();
		System.out.println("내가 가고 싶은 여행지는 " + trip[0] + ", " + trip[1] + ", " + trip[2] + "이다. 빨리가자!"); 
		
		//2. 제일 가고 싶은 여행지를 가지고 와서 다음과 같이 출력
		//    제일 가고 싶은 여행지는 울릉도인데 가기 쉽지 않다.
		System.out.println("제일 가고 싶은 여행지는 " + tour.제일가고싶은여행지() + "인데 가기 쉽지 않다.");
		
		//3. 여행지경비(2, 50000)을 호출하여 다음과 같이 출력
		//    여행경비가 20만원이 넘으면   "더 모아야한다."
		//    여행경비가 20만원 미만이면 "이제 여행을 떠나도 된다."
		int result = tour.여행지경비(2, 50000);
		
		String e = result > 200000 ? "이제 여행을 떠나도 된다." : "더 모아야 한다.";
		System.out.println(e);
		

	}

}
