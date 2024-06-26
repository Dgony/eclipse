package 생성자;

public class 여러가지마스크 {

	public static void main(String[] args) {
		// 마스크 써보기
		마스크 mask1 = new 마스크("yellow", 1000, 2);
		마스크 mask2 = new 마스크("blue", 2000, 3);
		
		System.out.println(mask1);
		System.out.println(mask1.color);
		System.out.println(mask1.price);
		System.out.println(mask1.count);
		System.out.println(mask2);

	}

}
