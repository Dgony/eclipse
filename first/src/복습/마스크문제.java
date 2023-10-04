package 복습;

public class 마스크문제 {

	public static void main(String[] args) {
		short waterPrice = 1000;
		byte waterCount = 2;
		short maskPrice = 2000;
		byte maskCount = 3;
		
		int water = waterPrice * waterCount;
		int mask = maskCount * maskPrice;
		int pay = water + mask;
		
		System.out.println(pay);

	}

}
