package 부품사용하기;

import 부품만들기.계좌;

public class 계좌정보프린트 {

	public static void main(String[] args) {
		계좌 acc1 = new 계좌();
		acc1.이름 = "홍길동";
		acc1.계좌이름 = "튼튼적금";
		acc1.금액 = 1000;
		
		계좌 acc2 = new 계좌();
		acc2.이름 = "박길동";
		acc2.계좌이름 = "튼튼예금";
		acc2.금액 = 2000;
		
		계좌 acc3 = new 계좌();
		acc3.이름 = "홍기사";
		acc3.계좌이름 = "다음적금";
		acc3.금액 = 3000;
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
	}

}
