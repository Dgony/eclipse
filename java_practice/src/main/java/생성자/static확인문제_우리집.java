package 생성자;

public class static확인문제_우리집 {

	public static void main(String[] args) {
		// 딸이 태어날 때마다 아빠 지갑에서 1000원씩 용돈 줘서 빠져나감
		딸 d1 = new 딸("미숙이", "여자");
		딸 d2 = new 딸("전숙이", "여자");
		딸 d3 = new 딸("경숙이", "여자");
		딸 d4 = new 딸("민숙이", "여자");
		딸 d5 = new 딸("정숙이", "여자");
		딸 d6 = new 딸("금숙이", "여자");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		딸.tv보다();
		
		System.out.println(딸.wallet);

	}

}
