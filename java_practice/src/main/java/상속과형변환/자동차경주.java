package 상속과형변환;

public class 자동차경주 {

	public static void main(String[] args) {
		자동차 car1 = new 자동차("빨강색");
		자동차 car2 = new 자동차("노란색");
		자동차 car3 = new 자동차("파랑색");
		
		날으는자동차 flycar1 = new 날으는자동차("빨간자두섹");
		날으는자동차 flycar2 = new 날으는자동차("노란자두섹");
		날으는자동차 flycar3 = new 날으는자동차("파란자두섹");
		
		car1.run();
		car2.run();
		car3.run();
		
		flycar1.run();
		flycar2.run();
		flycar3.run();

	}

}
